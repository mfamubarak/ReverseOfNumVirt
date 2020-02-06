package com.ahamed.springproject.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/services")
public class EmployeeControler {
@RequestMapping("/hello")
public String greeting(){
    return "<h1>Hello Spring Boot</h1>";
}

}
