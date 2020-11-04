DROP VIEW IF EXISTS CatalogService_Books;
DROP VIEW IF EXISTS EmployeeService_DeptEmp;
DROP VIEW IF EXISTS EmployeeService_Employee;

DROP TABLE IF EXISTS my_Dept;
DROP TABLE IF EXISTS my_Employee;
DROP TABLE IF EXISTS my_bookshop_Books;

CREATE TABLE my_Dept (
  ID INTEGER NOT NULL,
  NAME NVARCHAR(5000),
  CREATE_DATE DATE,
  PRIMARY KEY(ID)
);

CREATE TABLE my_Employee (
  ID INTEGER NOT NULL,
  NAME NVARCHAR(5000),
  SALARY INTEGER,
  DEPT_ID INTEGER,
  depts_ID INTEGER,
  PRIMARY KEY(ID)
);

CREATE TABLE my_bookshop_Books (
  ID INTEGER NOT NULL,
  title NVARCHAR(5000),
  stock INTEGER,
  PRIMARY KEY(ID)
);

CREATE VIEW CatalogService_Books AS SELECT
  Books_0.ID,
  Books_0.title,
  Books_0.stock
FROM my_bookshop_Books AS Books_0;

CREATE VIEW EmployeeService_DeptEmp AS SELECT
  Dept_0.ID,
  Dept_0.NAME,
  Dept_0.CREATE_DATE,
  Employee_1.ID AS emp_id,
  Employee_1.NAME AS emp_name,
  Employee_1.SALARY
FROM (my_Dept AS Dept_0 LEFT JOIN my_Employee AS Employee_1 ON Dept_0.ID = Employee_1.DEPT_ID);

CREATE VIEW EmployeeService_Employee AS SELECT
  Employee_0.ID,
  Employee_0.NAME,
  Employee_0.SALARY,
  Employee_0.DEPT_ID,
  Employee_0.depts_ID
FROM my_Employee AS Employee_0;

