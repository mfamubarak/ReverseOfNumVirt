package com.ahamed.springproject.Controller;

import com.ahamed.springproject.model.Employee;
import com.ahamed.springproject.repository.EmployeeRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/services")
public class EmployeeControler {
@RequestMapping("/hello")
public String greeting(){
    return "<h1>Hello Spring Boot</h1>";
}

     EmployeeRepository employeeRepository=new EmployeeRepository();
@RequestMapping("/employee")
    public List<Employee> getAllEmployees(){

        return employeeRepository.getAllEmployees();
    }
}
