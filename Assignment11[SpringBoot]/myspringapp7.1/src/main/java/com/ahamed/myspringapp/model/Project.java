package com.ahamed.myspringapp.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;
@Entity
public class Project {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Integer id;
    String name;

    @ManyToMany(mappedBy = "project")
            /*@JoinTable(name = "emp_Projects",
            joinColumns = {@JoinColumn(name="pid",referencedColumnName="id")},
            inverseJoinColumns={@JoinColumn(name="eid",referencedColumnName="id")})*/

   @JsonIgnore
    public List<Employee> employeeList;

    public Project() {
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

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


}
