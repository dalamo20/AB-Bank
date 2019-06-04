package com.Accounts;

public class Account {

    private int accNum;
    private String accType;
    private double amount;

    public void setAccNum(int accNum) {
        this.accNum = accNum;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getAccNum() {
        return accNum;
    }

    public String getAccType() {
        return accType;
    }

    public double getAmount() {
        return amount;
    }

    void insert(int accNum,String accType, double amount){
        this.accNum = accNum;
        this.accType = accType;
        this.amount = amount;
    }

    void deposit(double amount){
        this.amount += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount){
        if(this.amount < amount){
            System.out.println("Insufficient Balance");
        }else{
            this.amount -= amount;
            System.out.println("Withdrawn: " + amount);
        }
    }


    void checkBalance(){
        System.out.println("Balance: "+ amount);
    }


    void display(){
        System.out.println("Account: " + accType + "\t" + "Account Number: "+ accNum + "\t\t" +"Balance: "+ amount);
    }

}
