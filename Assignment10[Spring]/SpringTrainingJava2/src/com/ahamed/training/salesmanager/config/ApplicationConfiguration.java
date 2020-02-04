package com.ahamed.training.salesmanager.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ahamed.training.salesmanager.repository.EmployeeRepository;
import com.ahamed.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.ahamed.training.salesmanager.service.EmployeeService;
import com.ahamed.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
public class ApplicationConfiguration {
	
	@Bean(name="employeeService")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl(
		getEmployeeRepository());
		
		return employeeService;
	}

	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository() {
		
		return new HibernateEmployeeRepositoryImpl();
	}
	
	
	

}
