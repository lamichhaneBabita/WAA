package edu.mum.cs.lesson10.controller;

import edu.mum.cs.lesson10.domain.Employee;
import edu.mum.cs.lesson10.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping("/ajax/post")
    public Employee saveEmployee(@Valid @RequestBody Employee employee){
        System.out.println(employee);
        employeeService.saveEmployee(employee);
        return employee;
    }

}
