package com.claim;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner sc1 = new Scanner(System.in);
		
		//Create customer object
		Customer customer = new Customer();
		
		
		System.out.println("Enter First Name");
		customer.setFirstName(sc.nextLine());
			
		System.out.println("Enter Last Name");
		customer.setLastName(sc.nextLine());
		
		System.out.println("Enter age");
		customer.setAge(sc.nextInt());
		
		System.out.println("Enter email");
		customer.setEmail(sc.next());
		
		System.out.println("Enter phone number");
		customer.setPhoneNumber(sc.next());
		
		System.out.println("Enter salary");
		customer.setSalary(sc.nextDouble());;
		
		System.out.println("Enter loan amount");
		customer.setLoanAmount(sc.nextDouble());
		
		System.out.println("Enter interest rate");
		customer.setInterestRate(sc.next());
		
		customer.generateID();
		
		System.out.println(customer);
		
		
		customer.loanApproval();
		
	

		
	}

}
