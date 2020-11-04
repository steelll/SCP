package cds.gen.employeeservice;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;

@CdsName("EmployeeService.DeptEmp")
public interface DeptEmp extends CdsData {
  String CREATE_DATE = "CREATE_DATE";

  String SALARY = "SALARY";

  String EMP_NAME = "emp_name";

  String ID = "ID";

  String NAME = "NAME";

  String EMP_ID = "emp_id";

  @CdsName(CREATE_DATE)
  LocalDate getCreateDate();

  @CdsName(CREATE_DATE)
  void setCreateDate(LocalDate createDate);

  @CdsName(SALARY)
  Integer getSalary();

  @CdsName(SALARY)
  void setSalary(Integer salary);

  @CdsName(EMP_NAME)
  String getEmpName();

  @CdsName(EMP_NAME)
  void setEmpName(String empName);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  @CdsName(NAME)
  String getName();

  @CdsName(NAME)
  void setName(String name);

  @CdsName(EMP_ID)
  Integer getEmpId();

  @CdsName(EMP_ID)
  void setEmpId(Integer empId);

  static DeptEmp create() {
    return Struct.create(DeptEmp.class);
  }
}
