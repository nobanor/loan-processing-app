package com.claim;

import java.util.Random;

public class Customer {
	private String customerID;
	private String firstName;
	private String lastName;
	private int age;
	private String email;
	private String phoneNumber;
	private double salary;
	private double loanAmount;
	private String interestRate;
	

	
	public void loanApproval () {
		
		if (loanAmount>salary *3)
		{
			System.out.println("Your loan is denied because it is 3 times your salary");
		}
		else if (loanAmount>60000)
		{
			System.out.println("Your loan is denied because it exceeds 60000");
		}
		else if (age < 18)
		{
			System.out.println("Customer is too young to get a loan");
		}
		else 
		{
				System.out.println("Your loan is succesfully processed");
		}
	}
	
	public void generateID () {
		char letter1 = getFirstName().charAt(0);
		int min = 10;
		int max = 99;
		Random rn = new Random();
		int randomNumber = rn.nextInt(max-min);
		//String id = letter1 + Integer.toString(randomNumber);	
		//int random = (int )((Math.random() * 100) + 1);	
		customerID = letter1+String.valueOf(randomNumber);
		
	}
	public Customer ()
	{
		
	}
	
	public Customer(String firstName, String lastName, String email, String phoneNumber,
					double salary, double loanAmount, String interestRate, int age, String customerID)
	{
		
		
	}

	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public String getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(String interestRate) {
		this.interestRate = interestRate;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Customer Information"+"\n"+"Customer ID: " + customerID + "\n"+"First Name: " + firstName + "\n"+ "Last Name: " + lastName + "\n"+"Age: "
				+ age + "\n"+"Email: " + email +"\n"+ "Phone Number: " + phoneNumber + "\n"+"Salary: " + salary + "\n"+"Loan Amount: "
				+ loanAmount +"\n"+ "Interest Rate: " + interestRate + "\n";
	}
	
	
	
	
}