import java.lang.*;
public class Account
{
	private String accHolderName;
	private int accNo;
	private double balance;
	
	public Account()
	{
		System.out.println("Empty Constructor");
	}
	public Account(String accHolderName, int accNo, double balance)
	{
		System.out.println("Parameterized Constructor");
		//this.accHolderName = accHolderName;
		//this.accNo = accNo;
		//this.balance = balance;
		setAccHolderName(accHolderName);
		setAccNo(accNo);
		setBalance(balance);
	}
	public void setAccHolderName(String accHolderName)
	{
		this.accHolderName = accHolderName;
	}
	public void setAccNo(int accNo)
	{
		this.accNo = accNo;
	}
	public void setBalance(double balance)
	{
		if(balance>0)
		{
			this.balance = balance;
		}
		else
		{
			System.out.println("Invalid Balance!");
		}	
	}
	public String getAccHolderName()
	{
		return accHolderName;
	}
	public int getAccNo()
	{
		return accNo;
	}
	public double getBalance()
	{
		return balance;
	}
	public void display()
	{
		System.out.println("Account Holder Name: "+ accHolderName);
		System.out.println("Account Number: "+ accNo);
		System.out.println("Balance: "+ balance);
	}
	public void deposit(double amount)
	{
		if(amount>0)
		{
			balance = balance + amount;
			System.out.println("Deposit successful!");
		}
		else
		{
			System.out.println("Invalid amount.");
		}			
	}
	public void withdraw(double amount)
	{
		if(amount>0 && balance >= amount)
		{
			balance = balance - amount;
			System.out.println("Withdraw successful!");
		}
		else
		{
			System.out.println("Invalid amount or insufficient balance!");
		}
		
	}
	public void transfer(Account a, double amount)
	{
		//implement proper validation
		this.balance = this.balance - amount;
		a.balance = a.balance + amount;
	}
}
