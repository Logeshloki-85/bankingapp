
package Bankingapp;

import java.util.Scanner;
public class BankingExcecute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Choose Account Type:");
		System.out.println("Enter 1 for Savings Account");
		System.out.println("Enter 2 for Loan Account");
		int accounttype=s1.nextInt();
		System.out.println("Enter Account Number : ");
		long accno=s1.nextLong();
		System.out.println("Enter Account Holder Name : ");
		String name=s1.next();
		System.out.println("Enter Account Balance : ");
		double amount=s1.nextDouble();
		System.out.println(".....Enter Account Holder Address Here.....");
		System.out.println("Enter Door No :");
		String doorno=s1.next();
		System.out.println("Enter Street Name : ");
		String streetname=s1.next();
		System.out.println("Enter District : ");
		String district=s1.next();
		System.out.println("Enter State : ");
		String state=s1.next();
		System.out.println("Enter Pincode : ");
		int pincode=s1.nextInt();
		if(accounttype==1) {
			Account a1=new SavingsAccount(accno,name,amount,doorno,streetname,district,state,pincode);//upcasting
			/*Account class is a Abstract Class we can't create a object for it
			 *So we Create a sub class object and Store it in to super class reference varible
			 *if we want to access the super class properties through out the super class reference variabe we can access
			 * simple it perform (Run time polymorphism)
			 * -->Inheritance
			 * -->Method overriding
			 * -->Upcasting
			 * */
			System.out.println("Enter 1 for Deposite Amount:");
			System.out.println("Enter 2 for Withdraw Amount :");
			System.out.println("Enter 3 for Balance Enquriy :");
			int Operation=s1.nextInt();
			if(Operation==1) {
				System.out.println("Enter your Deposite Amount : ");
				double amt=s1.nextDouble();
				a1.DepositeAmount(amt);
			}
			else if(Operation==2){
				System.out.println("Enter your withdraw Amount : ");
				double amt=s1.nextDouble();
				a1.WithdrawAmount(amt);
			}
			else if(Operation==3) {
				a1.BalanceEnquiry();
			}
			else {
				System.out.println("invalid Operation.....");
			}
			
			
		}
		else if (accounttype==2) {
			Account a1=new LoanAccount(accno,name,amount,doorno,streetname,district,state,pincode);//upcasting
			/*Account class is a Abstract Class we can't create a object for it
			 *So we Create a sub class object and Store it in to super class reference varible
			 *if we want to access the super class properties through out the super class reference variabe we can access
			 * simple it perform (Run time polymorphism)
			 * -->Inheritance
			 * -->Method overriding
			 * -->Upcasting
			 * */
			System.out.println("Enter 1 for Deposite Amount:");
			System.out.println("Enter 2 for Withdraw Amount");
			System.out.println("Enter 3 fro Balance Enquriy :");
			int Operation=s1.nextInt();
			if(Operation==1) {
				System.out.println("Enter your Deposite Amount : ");
				double amt=s1.nextDouble();
				a1.DepositeAmount(amt);
			}
			else if(Operation==2){
				System.out.println("Enter your withdraw Amount : ");
				double amt=s1.nextDouble();
				a1.WithdrawAmount(amt);
			}
			else if(Operation==3) {
				a1.BalanceEnquiry();
			}
			else {
				System.out.println("invalid Operation.....");
			}
		}
		else {
			System.out.println("invalid Account Type");
			System.out.println("Please Check your Account Type");
		}

	}
}
