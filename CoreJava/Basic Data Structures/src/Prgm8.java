import java.util.Arrays;

public class Prgm8 {

	public static void main(String[] args) {
		int a[]= {7,11,9,2,17,4};
		for(int j=0;j<a.length;j++)
		{
			int num=a[0];
			int temp=0;
			for(int i=1;i<a.length;i++)
			{
				if(a[i]>num)
				{
					num=a[i];
				}
				else
				{
					temp=a[i];
					a[i]=num;
					a[i-1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
