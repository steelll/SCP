package cds.gen.my;

import com.sap.cds.ql.CdsName;
import java.lang.Class;
import java.lang.String;

@CdsName("my")
public interface My_ {
  String CDS_NAME = "my";

  Class<Dept_> DEPT = Dept_.class;

  Class<Employee_> EMPLOYEE = Employee_.class;
}
