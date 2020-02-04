import com.ahamed.training.salesmanager.model.Employee;
import com.ahamed.training.salesmanager.service.EmployeeService;
import com.ahamed.training.salesmanager.service.EmployeeServiceImpl;

import java.util.List;

public class MainApp {

    public static void main(String[] args) {
        EmployeeService employeeService=new EmployeeServiceImpl();
        List<Employee> employees=employeeService.getAllEmployees();

        for(Employee employee: employees){
            System.out.println(employee.getEmployeeName()+" at "+employee.getEmployeeLocation());
        }


    }

}
