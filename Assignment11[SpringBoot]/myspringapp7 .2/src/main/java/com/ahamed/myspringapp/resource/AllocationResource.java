package com.ahamed.myspringapp.resource;

import com.ahamed.myspringapp.model.Allocation;
import com.ahamed.myspringapp.repository.AllocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/rest/users")
public class AllocationResource {

    @Autowired
    AllocationRepository allocationRepository;

    @GetMapping(value="/all")
     public List<Allocation> getAll(){
        return allocationRepository.findAll();
    }

    @PostMapping(value="/load")
    public List<Allocation> persist(@RequestBody final Allocation allocation){

        allocationRepository.save(allocation);
        return allocationRepository.findAll();
    }

}
