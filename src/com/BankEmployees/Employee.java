package com.BankEmployees;

public class Employee {
    private String empName;
    private double salary;
    private String dept;
    private int deptId;
    private String position;
    private int empId;
    private String empPass;
    private String empUser;
    
    public int getDeptId() {
    	return deptId;
    }
    
    public void setDeptId(int deptId) {
    	this.deptId = deptId;
    }

    public String getEmpPass() {
        return empPass;
    }

    public String getEmpUser() {
        return empUser;
    }

    public void setEmpPass(String empPass) {
        this.empPass = empPass;
    }

    public void setEmpUser(String empUser) {
        this.empUser = empUser;
    }


    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void setSalary(String salary) {
        this.salary = Double.parseDouble(salary);
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public void setEmpId(String empId) {
        this.empId = Integer.parseInt(empId);
    }
    
    @Override
    public String toString() {
    	return "Employee [empId= " + empId + ", employee= "+ empName + ", position= "+ position 
    			+ ", department= "+ dept + ", dept.Id= " + deptId + ", salary= " + salary + "]";
    }
    
    public Employee(String empName, double salary, String dept, int deptId, String position, int empId, String empUser, String empPass) {
        this.empName = empName;
        this.salary = salary;
        this.dept = dept;
        this.deptId = deptId;
        this.position = position;
        this.empId = empId;
        this.empUser = empUser;
        this.empPass = empPass;
        
    }

}
