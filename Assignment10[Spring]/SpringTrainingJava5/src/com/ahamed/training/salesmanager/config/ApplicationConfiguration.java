package com.ahamed.training.salesmanager.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.ahamed.training.salesmanager.repository.EmployeeRepository;
import com.ahamed.training.salesmanager.repository.HibernateEmployeeRepositoryImpl;
import com.ahamed.training.salesmanager.service.EmployeeService;
import com.ahamed.training.salesmanager.service.EmployeeServiceImpl;

@Configuration
@ComponentScan("com.ahamed")
@PropertySource("application.properties")
public class ApplicationConfiguration {
	
	@Bean(name="employeeService")
	@Scope("prototype")
	public EmployeeService getEmployeeService() {
		
		EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
		
		
		return employeeService;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
/*	@Bean(name = "employeeRepository")
	public EmployeeRepository getEmployeeRepository() {
		
		return new HibernateEmployeeRepositoryImpl();
	}
	
	*/
	

}
