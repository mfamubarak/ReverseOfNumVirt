import com.ahamed.training.salesmanager.config.ApplicationConfiguration;
import com.ahamed.training.salesmanager.model.Employee;
import com.ahamed.training.salesmanager.service.EmployeeService;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

    public static void main(String[] args) {
    	
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        EmployeeService employeeService= applicationContext.getBean(
        		"employeeService",EmployeeService.class);
        List<Employee> employees=employeeService.getAllEmployees();

        for(Employee employee: employees){
            System.out.println(employee.getEmployeeName()+" at "+employee.getEmployeeLocation());
        }
    	
    	

    }

}
