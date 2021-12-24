import java.util.Scanner;

public class Prgm2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter starting range:");
		int start=sc.nextInt();
		System.out.println("Enter ending range:");
		int end=sc.nextInt();
		System.out.println("Armstrong number in the range "+start+" & "+end+" are");
		for(int i=start;i<=end;i++)
		{
			int number=i;
			int sum=0;
			int count=count(number);
			while(number!=0)
			{
				int rem=number%10;
				sum=(int) (sum+Math.pow(rem,count));
				number=number/10;
			}
			if(sum==i)
			{
				System.out.println(i);
			}
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
