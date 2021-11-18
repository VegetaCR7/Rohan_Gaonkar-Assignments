import java.util.Scanner;

public class Prgm5 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a income:");
		int income=(int)sc.nextDouble();
		double tax=0;
		if(income>=0 && income<=180000)
		{
			tax=0.0;
		}
		else if(income>=180001 && income<=300000)
		{
			tax=income*0.1;
		}
		else if(income>=300001 && income<=500000)
		{
			tax=income*0.2;
		}
		else if(income>=500001 && income<=1000000)
		{
			tax=income*0.3;
		}
		System.out.println("Tax amount is "+tax);
	}

}
