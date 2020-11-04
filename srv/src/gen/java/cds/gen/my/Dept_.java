package cds.gen.my;

import com.sap.cds.ql.CdsName;
import com.sap.cds.ql.ElementRef;
import com.sap.cds.ql.StructuredType;
import com.sap.cds.ql.cqn.CqnPredicate;
import java.lang.Integer;
import java.lang.String;
import java.time.LocalDate;
import java.util.function.Function;

@CdsName("my.Dept")
public interface Dept_ extends StructuredType<Dept_> {
  String CDS_NAME = "my.Dept";

  ElementRef<LocalDate> CREATE_DATE();

  ElementRef<Integer> ID();

  Employee_ employee();

  Employee_ employee(Function<Employee_, CqnPredicate> filter);

  ElementRef<String> NAME();
}
