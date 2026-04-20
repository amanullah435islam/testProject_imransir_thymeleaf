package org.testprojectimransir.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.testprojectimransir.entity.Employee;
import org.testprojectimransir.service.EmployeeService;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
private EmployeeService employeeService;

//@GetMapping("/home")  //its call mapping.
//    public String home(){
//        return "home";   //its call .html page.
//    }

//@GetMapping("/empsave")  //its call mapping.
//    public String empsave(){
//        return "addEmployee";   //its call .html page.
//    }

    @PostMapping("/save")
    public String save(@ModelAttribute Employee employee){
    employeeService.save(employee);

        return "redirect:/home";
    }

    @GetMapping("/empform")
    public String empForm(Model model){
    model.addAttribute("employee", new Employee());
            return "addEmployee";
    }

    @GetMapping("/home")
    public String getAllEmployees(Model model){
        List<Employee> list = employeeService.getAll();
        model.addAttribute("list", list);
        return "home";

    }

    @GetMapping("/edit/{id}")
public String edit(@PathVariable Long id, Model model){
//    Employee employee = employeeService.getById(id);
//    model.addAttribute("employee", employee);
////  //or::::::::
    model.addAttribute("employee", employeeService.getById(id));
    return  "addEmployee";

}

@GetMapping("/delete/{id}")
public String delete(@PathVariable Long id){
    employeeService.delete(id);
    return "redirect:/home";
}



}
