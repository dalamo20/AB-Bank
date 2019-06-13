package com.bank.beans;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	int userChoice;
	boolean exit = false;
	
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
			break;
		case 2:
			//deposit
			break;
		case 3:
			//withdraw
			break;
		case 4:
			//check balance
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
