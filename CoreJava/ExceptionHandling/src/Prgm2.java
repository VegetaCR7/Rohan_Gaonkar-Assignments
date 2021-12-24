import java.util.Scanner;

public class Prgm2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st no.:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd no.:");
		int b=sc.nextInt();
		try
		{
			if(b==0)
			{
				throw new UnsupportedOperationException("Cannot divide by 0");
			}
			int c=a/b;
			System.out.println("Divison is "+c);
		}
		catch(UnsupportedOperationException e)
		{
			System.out.println(e);
		}
		finally 
		{
			sc.close();
		}
	}

}
class UnsupportedOperationException extends Exception{

	public UnsupportedOperationException(String message) {
		super(message);
	}
	
}