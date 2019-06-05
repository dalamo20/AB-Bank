package com.BankEmployees;
import java.util.*;

public class Employees {
    public static void main(String[] args){

        Employee emp1 = new Employee("Miguel Barnes", 30000.00, "Finance", 3, "Teller", 921, "mBarnes", "password");
        Employee emp2 = new Employee("Janet Brown", 60000.00, "Management", 2, "Manager", 338, "jBrown", "password");
        Employee emp3 = new Employee("Amy Lee", 30000.00, "Finance", 3, "Teller", 987, "aLee", "password");
        Employee emp4 = new Employee("Jason Ford", 30000.00, "Finance", 3, "Teller", 930, "jFord", "password");
        Employee emp5 = new Employee("Shashi Aziz", 120000.00, "Business", 1, "CEO", 123, "sAziz", "password");


        System.out.println("Employee Name:\t\t" +  "Salary:\t\t" + "Department:\t\t" + "Dept. ID:\t\t" + "Position:\t\t" + "Username:\t\t" + "Password:\t\t");
        System.out.println(emp1.getEmpName() + "\t\t" + emp1.getSalary() + "\t\t" + emp1.getDept() + "\t\t\t" + emp1.getDeptId() + "\t\t\t" + emp1.getPosition() + "\t\t\t"+emp1.getEmpUser() + "\t\t\t" + emp1.getEmpPass());
        System.out.println(emp2.getEmpName() + "\t\t" + emp2.getSalary() + "\t\t" + emp2.getDept() + "\t\t" + emp2.getDeptId() + "\t\t\t" + emp2.getPosition() + "\t\t\t" + emp2.getEmpUser() + "\t\t\t" + emp2.getEmpPass());
        System.out.println(emp3.getEmpName() + "\t\t\t" + emp3.getSalary() + "\t\t" + emp3.getDept() + "\t\t\t" + emp3.getDeptId() + "\t\t\t" + emp3.getPosition() + "\t\t\t" + emp3.getEmpUser() + "\t\t\t" + emp3.getEmpPass());
        System.out.println(emp4.getEmpName() + "\t\t" + emp4.getSalary() + "\t\t" + emp4.getDept() + "\t\t\t" + emp4.getDeptId() + "\t\t\t" + emp4.getPosition() + "\t\t\t" + emp4.getEmpUser() + "\t\t\t" + emp4.getEmpPass());
        System.out.println(emp5.getEmpName() + "\t\t" + emp5.getSalary() + "\t" + emp5.getDept() + "\t\t" + emp5.getDeptId() + "\t\t\t" + emp5.getPosition() + "\t\t\t" + emp5.getEmpUser() + "\t\t\t" + emp5.getEmpPass());
    }
}
