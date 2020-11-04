using { my } from '../db/sample';
service EmployeeService {
    //entity DeptSrv as projection on my.Dept;

    entity DeptEmp as select from my.Dept left join my.Employee on Dept.ID=Employee.DEPT_ID {
        Dept.ID, Dept.NAME, Dept.CREATE_DATE, Employee.ID as emp_id, Employee.NAME as emp_name, Employee.SALARY
    };
        
    entity Employee as select from my.Employee{*};

    // entity Employee1 as projection on my.Employee;
    }
