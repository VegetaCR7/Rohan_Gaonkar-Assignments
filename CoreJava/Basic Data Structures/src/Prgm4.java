import java.util.Scanner;

public class Prgm4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the marks for Subject 1:");
		int subj1=sc.nextInt();
		System.out.println("Enter the marks for Subject 2:");
		int subj2=sc.nextInt();
		System.out.println("Enter the marks for Subject 3:");
		int subj3=sc.nextInt();
		
		if(subj1>60 && subj2 >60 && subj3>60)
		{
			System.out.println("Passed");
			return;
		}
		if(subj1>60)
		{
			if(subj2>60)
			{
				System.out.println("Promoted");
			}
			else if(subj3>60)
			{
				System.out.println("Promoted");
			}
			else
			{
				System.out.println("Failed");
			}
		}
		else
		{
			if(subj2>60 && subj3>60)
			{
				System.out.println("Promoted");
			}
			else if(subj3<=60 && subj3<=60)
			{
				System.out.println("Failed");
			}
		}
	}

}
