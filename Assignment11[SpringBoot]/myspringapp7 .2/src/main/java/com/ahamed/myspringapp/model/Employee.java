package com.ahamed.myspringapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Employee {


    private Integer id;
    private String name;






    public Employee() {
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
