import java.util.Scanner;

public class Prgm3 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int value=sc.nextInt();
		System.out.println("Enter a %rate:");
		int rate=sc.nextInt();
		System.out.println("Enter the years:");
		int years=sc.nextInt();
		double si=(value*rate*years)/100;
		double ci=(value*(Math.pow((0.01*rate)+1, years)))-value;
		System.out.println("Simple Interest is "+si);
		System.out.println("Compound Interest is "+ci);
	}
}
