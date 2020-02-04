package com.ahamed.training.salesmanager.repository;

import com.ahamed.training.salesmanager.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class HibernateEmployeeRepositoryImpl implements EmployeeRepository {

@Override
public List<Employee> getAllEmployees(){
    List<Employee> employees=new ArrayList<>();

    Employee employee=new Employee();
    employee.setEmployeeName("Ahamed");
    employee.setEmployeeLocation("Mount Lavinia");
    employees.add(employee);
    return employees;

}


}
