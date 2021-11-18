import java.util.Scanner;

public class Prgm1 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int sum=0;
		int temp=number;
		int count=count(number);
		while(number!=0)
		{
			int numMod=number%10;
			sum=(int) (sum+Math.pow(numMod,count));
			number=number/10;
		}
		if(sum==temp)
		{
			System.out.println(temp+" is an Armstrong Number");
		}
		else
		{
			System.out.println(temp+" is  not an Armstrong Number");
		}
	}
	public static int count(int n)
	{
		int c=0;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		return c;
	}
}
