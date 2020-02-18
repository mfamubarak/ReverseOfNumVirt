package com.ahamed.myspringapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.*;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.web.client.RestTemplate;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity
public class Allocation {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String name;

    public Allocation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
