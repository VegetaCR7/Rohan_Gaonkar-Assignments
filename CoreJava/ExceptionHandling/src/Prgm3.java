import java.util.Scanner;

public class Prgm3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		SavingsAccount sa=new SavingsAccount();
		System.out.println("Enter deposit amount:");
		double dep=sc.nextDouble();
		sa.deposit(dep);
		System.out.println("Enter the withdrawal amount:");
		double wit=sc.nextDouble();
		try{
			sa.withdrawal(wit);
		}
		catch(Exception e){
		 	System.out.println(e);
		}
		finally {
			sc.close();
		}	 			
	}

}

class SavingsAccount{
	long id;
	double balance;
	public double deposit(double amount)
	{
		balance=balance+amount;
		return balance;
	}
	double withdrawal(double amount) throws Exception
	{
		if(amount>balance || balance==0.0)
		{
			throw new InsufficientBalanceException("Either withdrawn amount is greater than balance or balance is 0.");
		}
		else if(amount<0)
		{
			throw new IllegalBankTransactionException("Withdrawal amount should not be less than 0.");
		}
		balance=balance-amount;
		return balance;
	}
	
}

class InsufficientBalanceException extends Exception{

	public InsufficientBalanceException(String message) {
		super(message);
	}
	
}

class IllegalBankTransactionException extends Exception{

	public IllegalBankTransactionException(String message) {
		super(message);
	}
	
}