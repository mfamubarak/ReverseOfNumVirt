package com.ahamed.myspringapp.resource;

import com.ahamed.myspringapp.model.Employee;
import com.ahamed.myspringapp.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/users")
public class EmployeeResource {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping(value="/all")
    public List<Employee> getAll(){
return employeeRepository.findAll();
    }

    @PostMapping(value="/load")
    public List<Employee> persist(@RequestBody final Employee employee){
        employeeRepository.save(employee);
        return employeeRepository.findAll();
    }

}
