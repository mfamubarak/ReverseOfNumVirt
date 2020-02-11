package com.ahamed.myspringapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import javax.persistence.*;
import java.util.List;

@Entity
@ContextConfiguration(classes = { RestTemplateConfig.class, HttpClientConfig.class })
public class Allocation {

    @Id
    @GeneratedValue
    private Integer id;
    private String name;



    @Autowired
    private Allocation fetchAllocations(Employee employee)
    {
        RestTemplate restTemplate;
        final String uri = "http://localhost:8080/rest/users/all";
        ResponseEntity<Allocation> allocationResponseEntity = restTemplate.exchange(uri+"/"+employee.getId().toString(),HttpMethod.GET,Allocation.class);
        HttpHeaders httpHeaders=new HttpHeaders();
        HttpEntity<String> httpEntity=new HttpEntity(){"body",HttpHeaders};

        if(allocationResponseEntity.getStatusCode().value()!=200)
            return allocationResponseEntity.getBody();


    }

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
