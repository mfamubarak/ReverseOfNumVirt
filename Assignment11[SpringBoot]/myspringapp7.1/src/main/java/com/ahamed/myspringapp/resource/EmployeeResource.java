package com.ahamed.myspringapp.resource;

import com.ahamed.myspringapp.model.Address;
import com.ahamed.myspringapp.model.Employee;
import com.ahamed.myspringapp.repository.AddressRepository;
import com.ahamed.myspringapp.repository.EmployeeRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/rest/users")
public class EmployeeResource {

    @Autowired
    EmployeeRepository employeeRepository;

    @Autowired
    AddressRepository addressRepository;





    @RequestMapping(value = "/employees", produces = MediaType.APPLICATION_XML_VALUE, method = RequestMethod.GET)
    public Employee find(Employee employee) {
        Optional<Employee> employee1=employeeRepository.findById(employee.getId());
       if(employee1.isPresent()){
           return employee;
       }
       else
           return null;
    }

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
