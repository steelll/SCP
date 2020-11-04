namespace my;

entity Dept {
    key ID : Integer;
    NAME : String;
    CREATE_DATE : Date;
    employee : Association to many Employee on employee.depts = $self;
}
entity Employee {
    key ID : Integer;
    NAME : String;
    SALARY : Integer;
    DEPT_ID : Integer;
    depts : Association to Dept;
}