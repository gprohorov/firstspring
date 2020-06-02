package edu.pro.firstspring.controller;


import edu.pro.firstspring.model.Chair;
import edu.pro.firstspring.service.chair.impls.ChairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/chair")
public class ChairRestController {

    @Autowired
    ChairServiceImpl service;



  // GET ALL
    @RequestMapping("/list")
    List<Chair>  getChairs(){

        return service.getAll();
    }
    // READ
    @RequestMapping("/get/{id}")
    Chair  getChair(@PathVariable(value = "id") String id){

        return service.get(id);
    }
    // DELETE
    @RequestMapping("/delete/{id}")
    Chair deleteChair(@PathVariable(value = "id") String id){

        return service.delete(id);
    }

    @PostMapping("/create")
    Chair createChair(@RequestBody Chair chair){
        return service.create(chair);
    }

    @PostMapping("/update")
    Chair updateChair(@RequestBody Chair chair){
        return service.update(chair);
    }






}
