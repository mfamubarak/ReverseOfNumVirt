package com.ahamed.springproject.repository;

import com.ahamed.springproject.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {

    public List<Employee> getAllEmployees(){
        List<Employee> employees=new ArrayList<>();

        Employee employee=new Employee();
        employee.setEmployeeName("Ahamed");
        employee.setEmployeeLocation("Mount Lavinia");
        employees.add(employee);
        return employees;

    }

}
