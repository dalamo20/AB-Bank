package com.BankEmployees;

public class Employees {
    public static void main(String[] args){

        Employee employee1 = new Employee("Miguel", "Barnes", 30000, "Finance", "Teller", 923003);
        Employee employee2 = new Employee("Janet", "Brown", 60000, "Finance", "Loan Officer", 338405);
        Employee employee3 = new Employee("Amy", "Lee", 45000, "Finance", "Manager", 987123);
        Employee employee4 = new Employee("Jason", "Ford", 30000, "Finance", "Teller", 930594);
        Employee employee5 = new Employee("Shashi", "Aziz", 120000, "Finance", "CEO", 123456);


        System.out.println("First Name:\t\t" + "Last Name:\t\t" +  "ID Number:\t\t" + "Department:\t\t" + "Position:\t\t" + "Salary:");
        System.out.println(employee1.getFirstName() + "\t\t\t" + employee1.getLastName() + "\t\t\t" + employee1.getEmployeeId() + "\t\t\t" + employee1.getDepartment() + "\t\t\t" + employee1.getPosition() + "\t\t\t" + employee1.getSalary());
        System.out.println(employee2.getFirstName() + "\t\t\t" + employee2.getLastName() + "\t\t\t" + employee2.getEmployeeId() + "\t\t\t" + employee2.getDepartment() + "\t\t\t" + employee2.getPosition() + "\t" + employee2.getSalary());
        System.out.println(employee3.getFirstName() + "\t\t\t\t" + employee3.getLastName() + "\t\t\t\t" + employee3.getEmployeeId() + "\t\t\t" + employee3.getDepartment() + "\t\t\t" + employee3.getPosition() + "\t\t\t" + employee3.getSalary());
        System.out.println(employee4.getFirstName() + "\t\t\t" + employee4.getLastName() + "\t\t\t" + employee4.getEmployeeId() + "\t\t\t" + employee4.getDepartment() + "\t\t\t" + employee4.getPosition() + "\t\t\t" + employee4.getSalary());
        System.out.println(employee5.getFirstName() + "\t\t\t" + employee5.getLastName() + "\t\t\t" + employee5.getEmployeeId() + "\t\t\t" + employee5.getDepartment() + "\t\t\t" + employee5.getPosition() + "\t\t\t\t" + employee5.getSalary());
    }
}
