package cds.gen.employeeservice;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("EmployeeService")
public interface EmployeeService_ {
  String CDS_NAME = "EmployeeService";

  Class<Employee_> EMPLOYEE = Employee_.class;

  Class<DeptEmp_> DEPT_EMP = DeptEmp_.class;
}
