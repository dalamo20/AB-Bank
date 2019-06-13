package com.bank.beans;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int userChoice;
	boolean exit = false;
	float balance = 0f;
	
	do {
		System.out.println("1. Create New Account");
		System.out.println("2. Deposit");
		System.out.println("3. Withdraw");
		System.out.println("4. Balance");
		System.out.println("0. Exit");
		userChoice = in.nextInt();
		switch(userChoice) {
		case 1:
			//create acct
			System.out.println("Coming soon!");
			break;
		case 2:
			//deposit
			float amount;
            System.out.print("Amount to deposit: ");
            amount = in.nextFloat();
            if (amount <= 0)
            System.out.println("Invalid transaction!");
            else {
            balance += amount;
            System.out.println("$" + amount + " deposited.");
            }
			break;
		case 3:
			//withdraw
			System.out.println("Amount to withdraw: ");
			amount = in.nextFloat();
			if(amount <=0 || amount > balance) {
				System.out.println("Invalid transaction!");
			}else {
				balance -= amount;
				System.out.println("$" + amount + " withdrawn.");
			}
			break;
		case 4:
			//check balance
			System.out.println("Balance: $" + balance);
			break;
		case 0:
			exit = true;
			break;
		default:
			System.out.println("Please choose a number from the menu.");
			break;
		}
		System.out.println();
	} while (!exit);
	System.out.println("Goodbye");
    }
}
