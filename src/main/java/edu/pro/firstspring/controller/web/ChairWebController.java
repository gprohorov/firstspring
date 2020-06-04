package edu.pro.firstspring.controller.web;

import edu.pro.firstspring.form.ChairForm;
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

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    String create(Model model) {
        String action = "Add ";
        ChairForm form = new ChairForm();
        model.addAttribute("form", form);
        model.addAttribute("action", action);
        return "addchairform";
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    String create(@ModelAttribute("form") ChairForm form) {

        Chair newChair = new Chair();
        newChair.setName(form.getName());
        newChair.setDesc(form.getDesc());
        service.create(newChair);
        return "redirect:/web/chair/get/list";
    }


    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    String update(Model model, @PathVariable("id") String id) {
        ChairForm form = new ChairForm();
        Chair chairToUpdate = service.get(id);
        String action = "Edit ";

        form.setId(chairToUpdate.getId());
        form.setName(chairToUpdate.getName());
        form.setDesc(chairToUpdate.getDesc());

        model.addAttribute("form", form);
        model.addAttribute("action", action);
        return "addchairform";
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    String update(@ModelAttribute("form") ChairForm form) {

        Chair refreshedChair = new Chair();
        refreshedChair.setId(form.getId());
        refreshedChair.setName(form.getName());
        refreshedChair.setDesc(form.getDesc());
        service.update(refreshedChair);
        return "redirect:/web/chair/get/list";
    }



}
