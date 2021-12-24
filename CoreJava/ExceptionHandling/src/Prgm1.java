import java.util.Scanner;

public class Prgm1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no.:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no.:");
		int b=sc.nextInt();
		try
		{
			int c=a/b;
			System.out.println("Divison is "+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
