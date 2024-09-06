package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int number = sc.nextInt();
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		double balance = sc.nextDouble();
		System.out.print("Withdraw limit:");
		double withdrawLimit = sc.nextDouble();
		
		Account account = new Account(number, holder, balance, withdrawLimit);
		
		System.out.println("Enter amount for withdraw: ");
		double amount = sc.nextDouble();
		account.withdraw(amount);
		System.out.println("New balance: " + balance);
		
		}
		catch(DomainException e){
			System.out.println("Withdraw error: " + e.getMessage() + "!");
		}
		catch(RuntimeException e) {
			System.out.println("Unexpected error!");
		}
		sc.close();

	}

}
