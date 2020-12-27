package com.kindsonthegenius.fleetapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeTypeController {

    @GetMapping("/employee-types")
    public String getEmployeeTypes(){
        return "employee_type";
    }
}
