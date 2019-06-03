package com.BankEmployees;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;
    private String department;
    private String position;
    private int employeeId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void setSalary(String salary) {
        this.salary = Integer.parseInt(salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
    public void setEmployeeId(String employeeId) {
        this.employeeId = Integer.parseInt(employeeId);
    }

    public Employee(String firstName, String lastName, int salary, String department, String position, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.position = position;
        this.employeeId = employeeId;
    }

    public Employee(String firstName, String lastName, int salary, int employeeId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = "";
        this.position = "";
        this.employeeId = employeeId;
    }

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.salary = 0;
        this.department = "";
        this.position = "";
        this.employeeId = 0;
    }
}
