import com.ahamed.training.salesmanager.model.Employee;
import com.ahamed.training.salesmanager.service.EmployeeService;
import com.ahamed.training.salesmanager.service.EmployeeServiceImpl;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
    	try {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext(
    			"applicationContext.xml");
        EmployeeService employeeService= applicationContext.getBean(
        		"employeeService",EmployeeService.class);
        List<Employee> employees=employeeService.getAllEmployees();

        for(Employee employee: employees){
            System.out.println(employee.getEmployeeName()+" at "+employee.getEmployeeLocation());
        }
    	
    	}
    	catch(Exception ee) {
    		System.out.println(ee.toString());
    		
    	}

    }

}
