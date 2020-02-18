package com.ahamed.myspringapp.resource;

import com.ahamed.myspringapp.model.Allocation;
import com.ahamed.myspringapp.model.Employee;
import com.ahamed.myspringapp.repository.AllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class AllocationResource {

    @Autowired
    AllocationRepository allocationRepository;

    @GetMapping("/all")
     public List<Allocation> getAll(){
        return allocationRepository.findAll();
    }

    @PostMapping("/load")
    public List<Allocation> persist(@Valid @RequestBody Allocation allocation){

        allocationRepository.save(allocation);
        return allocationRepository.findAll();
    }

   // final String uri = "http://localhost:8080/rest/users/employees";
    //RestTemplate restTemplate = new RestTemplate();

    @GetMapping("/allocation")
    private String fetchAllocations(Employee employee)
    {

        final String uri = "http://localhost:8080/rest/users/employeess";

        RestTemplate restTemplate = new RestTemplate();

       //Allocation result = restTemplate.getForObject(uri, Allocation.class);

       
       
      
    	      HttpHeaders headers = new HttpHeaders();
    	      headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
    	      HttpEntity <String> entity = new HttpEntity<String>(headers);
    	      
    	      return restTemplate.exchange(uri, HttpMethod.GET, entity, String.class).getBody();
    	  
       
       
       
        //System.out.println(result);

        //HttpHeaders headers = new HttpHeaders();
       // headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));

       // HttpEntity < String > entity = new HttpEntity < String > ("parameters", headers);
        //System.out.println(entity);
       // ResponseEntity<Employee> result = restTemplate.exchange(uri, HttpMethod.GET, entity, Employee.class);

      //  System.out.println(result);

      
    }




}
