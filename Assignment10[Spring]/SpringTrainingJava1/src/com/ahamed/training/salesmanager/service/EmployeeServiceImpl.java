package com.ahamed.training.salesmanager.service;

import com.ahamed.training.salesmanager.model.Employee;
import com.ahamed.training.salesmanager.repository.EmployeeRepository;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {

    EmployeeRepository employeeRepository;
    
        
    public EmployeeRepository getEmployeeRepository() {
    	return employeeRepository;
    }
    
    public void setEmployeeRepository(EmployeeRepository employeeRepository) { 
    	this.employeeRepository = employeeRepository; 
    	}

    public List<Employee> getAllEmployees(){

        return employeeRepository.getAllEmployees();
    }
}
