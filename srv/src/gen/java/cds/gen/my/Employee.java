package cds.gen.my;

import com.sap.cds.CdsData;
import com.sap.cds.Struct;
import com.sap.cds.ql.CdsName;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;

@CdsName("my.Employee")
public interface Employee extends CdsData {
  String DEPT_ID = "DEPT_ID";

  String SALARY = "SALARY";

  String ID = "ID";

  String DEPTS = "depts";

  String DEPTS_ID = "depts_ID";

  String NAME = "NAME";

  @CdsName(DEPT_ID)
  Integer getDeptId();

  @CdsName(DEPT_ID)
  void setDeptId(Integer deptId);

  @CdsName(SALARY)
  Integer getSalary();

  @CdsName(SALARY)
  void setSalary(Integer salary);

  @CdsName(ID)
  Integer getId();

  @CdsName(ID)
  void setId(Integer id);

  Dept getDepts();

  void setDepts(Map<String, ?> depts);

  @CdsName(DEPTS_ID)
  Integer getDeptsId();

  @CdsName(DEPTS_ID)
  void setDeptsId(Integer deptsId);

  @CdsName(NAME)
  String getName();

  @CdsName(NAME)
  void setName(String name);

  static Employee create() {
    return Struct.create(Employee.class);
  }
}
