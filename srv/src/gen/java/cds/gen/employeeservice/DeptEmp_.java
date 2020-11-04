package cds.gen.employeeservice;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;

@CdsName("EmployeeService.DeptEmp")
public interface DeptEmp_ extends StructuredType<DeptEmp_> {
  String CDS_NAME = "EmployeeService.DeptEmp";

  ElementRef<LocalDate> CREATE_DATE();

  ElementRef<Integer> SALARY();

  ElementRef<String> emp_name();

  ElementRef<Integer> ID();

  ElementRef<String> NAME();

  ElementRef<Integer> emp_id();
}
