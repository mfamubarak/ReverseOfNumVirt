package com.ahamed.training.salesmanager.repository;

import com.ahamed.training.salesmanager.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> getAllEmployees();
}
