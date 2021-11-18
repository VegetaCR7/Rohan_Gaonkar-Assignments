import java.util.Scanner;

public class Prgm6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;
		while(count!=3)
		{
			System.out.println("Enter User ID:");
			String userID=sc.nextLine();
			System.out.println("Enter password:");
			String pwd=sc.nextLine();
			if(userID.contains("@")==true && pwd.length()==5)
			{
				System.out.println("Welcome "+userID);
				return;
			}
			else
			{
				count++;
			}
		}
		if(count==3)
		{
			System.out.println("Contact Admin");
		}
	}
}