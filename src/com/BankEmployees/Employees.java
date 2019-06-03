package com.BankEmployees;

public class Employees {
    public static void main(String[] args){

        Employee employee1 = new Employee("Miguel", "Barnes", 30000, "Finance", "Teller", 923003, "mBarnes", "passage");
        Employee employee2 = new Employee("Janet", "Brown", 60000, "Finance", "Loan Officer", 338405, "jBrown", "passage");
        Employee employee3 = new Employee("Amy", "Lee", 45000, "Finance", "Manager", 987123, "aLee", "passage");
        Employee employee4 = new Employee("Jason", "Ford", 30000, "Finance", "Teller", 930594, "jFord", "passage");
        Employee employee5 = new Employee("Shashi", "Aziz", 120000, "Finance", "CEO", 123456, "sAziz", "passage");


        System.out.println("First Name:\t\t" + "Last Name:\t\t" +  "ID Number:\t\t" + "Department:\t\t" + "Position:\t\t" + "Salary:\t\t" + "Username:\t\t" + "Password:\t\t");
        System.out.println(employee1.getFirstName() + "\t\t\t" + employee1.getLastName() + "\t\t\t" + employee1.getEmployeeId() + "\t\t\t" + employee1.getDepartment() + "\t\t\t" + employee1.getPosition() + "\t\t\t" + employee1.getSalary() + "\t\t" +employee1.getEmpUserName() + "\t\t\t" + employee1.getEmpPassword());
        System.out.println(employee2.getFirstName() + "\t\t\t" + employee2.getLastName() + "\t\t\t" + employee2.getEmployeeId() + "\t\t\t" + employee2.getDepartment() + "\t\t\t" + employee2.getPosition() + "\t" + employee2.getSalary() + "\t\t" +employee2.getEmpUserName() + "\t\t\t" + employee2.getEmpPassword());
        System.out.println(employee3.getFirstName() + "\t\t\t\t" + employee3.getLastName() + "\t\t\t\t" + employee3.getEmployeeId() + "\t\t\t" + employee3.getDepartment() + "\t\t\t" + employee3.getPosition() + "\t\t\t" + employee3.getSalary() + "\t\t" +employee3.getEmpUserName() + "\t\t\t" + employee3.getEmpPassword());
        System.out.println(employee4.getFirstName() + "\t\t\t" + employee4.getLastName() + "\t\t\t" + employee4.getEmployeeId() + "\t\t\t" + employee4.getDepartment() + "\t\t\t" + employee4.getPosition() + "\t\t\t" + employee4.getSalary() + "\t\t" +employee4.getEmpUserName() + "\t\t\t" + employee4.getEmpPassword());
        System.out.println(employee5.getFirstName() + "\t\t\t" + employee5.getLastName() + "\t\t\t" + employee5.getEmployeeId() + "\t\t\t" + employee5.getDepartment() + "\t\t\t" + employee5.getPosition() + "\t\t\t\t" + employee5.getSalary() + "\t\t" +employee5.getEmpUserName() + "\t\t\t" + employee5.getEmpPassword());
    }
}
