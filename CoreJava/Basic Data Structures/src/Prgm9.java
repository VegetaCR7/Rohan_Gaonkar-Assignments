
public class Prgm9 {

	public static void main(String[] args) {
		int a[][]= {{23,56,91},{65,71,38},{78,40,82}};
		int totStud1=0,totStud2=0,totStud3=0,totSubj1=0,totSubj2=0,totSubj3=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(i==0)
				{
					totStud1=totStud1+a[i][j];
				}
				else if(i==1)
				{
					totStud2=totStud2+a[i][j];
				}
				else if(i==2)
				{
					totStud3=totStud3+a[i][j];
				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(j==0)
				{
					totSubj1=totSubj1+a[i][j];
				}
				else if(j==1)
				{
					totSubj2=totSubj2+a[i][j];
				}
				else if(j==2)
				{
					totSubj3=totSubj3+a[i][j];;
				}
			}
		}
		System.out.println("Total for student1 is "+totStud1+" and average is "+(totStud1/3));
		System.out.println("Total for student2 is "+totStud2+" and average is "+(totStud2/3));
		System.out.println("Total for student3 is "+totStud3+" and average is "+(totStud3/3));
		System.out.println("------------------------------------------------------------------");
		System.out.println("Total for subject1 is "+totSubj1+" and average is "+(totSubj1/3) );
		System.out.println("Total for subject2 is "+totSubj2+" and average is "+(totSubj2/3) );
		System.out.println("Total for subject3 is "+totSubj3+" and average is "+(totSubj3/3) );
	}

}
