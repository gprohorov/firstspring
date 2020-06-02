package edu.pro.firstspring.controller;


import edu.pro.firstspring.model.Student;
import edu.pro.firstspring.service.student.impls.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api/student")
@RestController
public class StudenrRestController {

    @Autowired
    StudentServiceImpl service;

    @RequestMapping("/get/list")
    List<Student>  getStudents(){
        return service.getAll();
    }


}
