package customer.steell1.handlers;

import org.springframework.stereotype.Component;

import java.util.stream.Stream;

import com.sap.cds.services.cds.CdsService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;

import cds.gen.employeeservice.EmployeeService_;
import cds.gen.employeeservice.Employee;
// import cds.gen.employeeservice.DeptEmp;

@Component
@ServiceName(EmployeeService_.CDS_NAME)
public class EmployeeServiceHandler implements EventHandler {

	@After(event = CdsService.EVENT_READ)
	public void highSalary(Stream<Employee> employee) {
		employee.filter(b -> b.getName() != null && b.getSalary() != null) 
		.filter(b -> b.getSalary() > 100)
		.forEach(b -> b.setName(b.getName() + " (High Salary)"));
	}

    // @After(event = CdsService.EVENT_READ)
    // public void highSalary2(Stream<DeptEmp> deptEmp) {
	// 	deptEmp.filter(o -> o.getName() != null && o.getSalary() != null) 
	// 	.filter(o -> o.getSalary() > 100)
    //     .forEach(o -> o.setName(o.getName() + " (High Salary)"))
    //     ;
	// }

}