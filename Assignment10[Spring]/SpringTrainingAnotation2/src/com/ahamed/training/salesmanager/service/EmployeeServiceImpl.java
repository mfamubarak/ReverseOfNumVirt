package com.ahamed.training.salesmanager.service;

import com.ahamed.training.salesmanager.model.Employee;
import com.ahamed.training.salesmanager.repository.EmployeeRepository;
import com.ahamed.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired 
    EmployeeRepository employeeRepository;
    
    public EmployeeServiceImpl() {
    	
    	}
    
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) { 
    	this.employeeRepository = employeeRepository; 
    	}
    
    public EmployeeRepository getEmployeeRepository() {
    	return employeeRepository;
    }
    
    public void setEmployeeRepository(EmployeeRepository employeeRepository) { 
    	System.out.println("Overloaded constructor exicutted");
    	this.employeeRepository = employeeRepository; 
    	}

    public List<Employee> getAllEmployees(){

        return employeeRepository.getAllEmployees();
    }
}
