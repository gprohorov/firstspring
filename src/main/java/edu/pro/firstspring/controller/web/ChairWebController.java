package edu.pro.firstspring.controller.web;

import edu.pro.firstspring.model.Chair;
import edu.pro.firstspring.service.chair.impls.ChairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/web/chair")
@Controller
public class ChairWebController {

    @Autowired
    ChairServiceImpl service;

    // GET ALL
    @RequestMapping("/get/list")
    String getChairs(Model model){

        List<Chair> chairs = service.getAll();
        model.addAttribute("chairs", chairs);

        return "chairlist";
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
    String delete(@PathVariable("id") String id){
        service.delete(id);
        return "redirect:/web/chair/get/list";
    }

    @RequestMapping(value = "/create/", method = RequestMethod.GET)
    String create(@RequestBody Chair chair) {
      //  service.delete(id);
        return "addchairform";
    }

    @RequestMapping(value = "/create/", method = RequestMethod.POST
    String create(@RequestBody Chair chair) {
      //  service.delete(id);
        return "addchairform";
    }



}
