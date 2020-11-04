package cds.gen.employeeservice;

import cds.gen.my.Dept_;
import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.util.function.Function;

@CdsName("EmployeeService.Employee")
public interface Employee_ extends StructuredType<Employee_> {
  String CDS_NAME = "EmployeeService.Employee";

  ElementRef<Integer> DEPT_ID();

  ElementRef<Integer> SALARY();

  ElementRef<Integer> ID();

  Dept_ depts();

  Dept_ depts(Function<Dept_, CqnPredicate> filter);

  ElementRef<Integer> depts_ID();

  ElementRef<String> NAME();
}
