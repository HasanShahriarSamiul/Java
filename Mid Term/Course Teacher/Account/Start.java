import java.lang.*;

public class Start
{
	public static void main(String[] args)
	{
		Account a1 = new Account();
		a1.setAccHolderName("John Wick");
		a1.setAccNo(10101);
		a1.setBalance(-500);
		a1.setBalance(500);
		
		System.out.println("Name: "+a1.getAccHolderName());
		System.out.println("Account Number: "+a1.getAccNo());
		System.out.println("Balance: "+a1.getBalance());
		
		Account a2 = new Account("Steve Rogers", 10102, 100);
		a2.display();
		
		a1.deposit(-1000);
		System.out.println("A1.Balance: "+a1.getBalance());
		a1.deposit(1000);
		System.out.println("A1.Balance: "+a1.getBalance());
		a1.withdraw(1501);
		System.out.println("A1.Balance: "+a1.getBalance());
		a1.withdraw(400);
		System.out.println("A1.Balance: "+a1.getBalance());
		a1.transfer(a2, 300);
		System.out.println("A1.Balance: "+a1.getBalance());
		System.out.println("A2.Balance: "+a2.getBalance());
		
		
	}
}