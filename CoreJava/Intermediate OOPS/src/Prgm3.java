
public class Prgm3 {
	
	public static void main(String[] args) {
		int s,f,TotalCash;
		Prgm3 p1=new SavingsAccount();
		Prgm3 p2= new CurrentAccount();
		s=((SavingsAccount) p1).cash();
		f=((CurrentAccount) p2).cash();
		TotalCash=s+f;
		System.out.println("Total cash in the bank is Rs."+TotalCash);
	}

}
class SavingsAccount extends Prgm3
{
	int cash()
	{
		int fixedDeposit=100000;
		return fixedDeposit;
		
	}
}
class CurrentAccount extends Prgm3
{
	int cash()
	{
		int cashCredit=200000;
		return cashCredit;
	}
}