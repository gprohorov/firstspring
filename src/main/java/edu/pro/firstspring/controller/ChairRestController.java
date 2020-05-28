package edu.pro.firstspring.controller;


import edu.pro.firstspring.model.Chair;
import edu.pro.firstspring.service.chair.impls.ChairServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/chair")
public class ChairRestController {

    @Autowired
    ChairServiceImpl service;




    @RequestMapping("/list")
    List<Chair>  getChairs(){
        return service.getAll();
    }




}
