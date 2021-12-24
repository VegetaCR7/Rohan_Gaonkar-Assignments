import java.util.Scanner;

public class Prgm7 {

	public static void main(String[] args) {
		int a[]= {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to search:");
		int num=sc.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==num)
			{
				System.out.println(num+" found at posotion "+(i+1));
			}
		}
	}

}
