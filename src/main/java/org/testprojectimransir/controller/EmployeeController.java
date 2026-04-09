package org.testprojectimransir.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.testprojectimransir.service.EmployeeService;

@Controller
public class EmployeeController {

    @Autowired
private EmployeeService employeeService;

@GetMapping("/home")
    public String home(){
        return "home";
    }


}
