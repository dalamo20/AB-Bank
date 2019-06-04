package com.Accounts;

public class Transactions {

        public static void main(String[] args){
            Account bill = new Account();
            bill.insert(832345,"Checking",1000.00);
            bill.display();
            bill.checkBalance();
            bill.deposit(40000.00);
            bill.checkBalance();
            bill.withdraw(15000.00);
            bill.checkBalance();
        }

}
