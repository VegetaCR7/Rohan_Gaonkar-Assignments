
public class Prgm1 {
	public static void main(String[] args) {
		System.out.println("Addition:-");
		Addition ad=(a,b)->a+b;
		System.out.println(ad.add(2,4));
		
		System.out.println("Subtraction:-");
		Subtraction sb=(a,b)->a-b;
		System.out.println(sb.sub(4,2));
		
		System.out.println("Multiplication:-");
		Multiplication mp=(a,b)->a*b;
		System.out.println(mp.mul(2,4));
		
		System.out.println("Division:-");
		Division dv=(a,b)->a/b;
		System.out.println(dv.div(4,2));
	}
}

@FunctionalInterface
interface Addition{
	int add(int a,int b);
}
@FunctionalInterface
interface Subtraction{
	int sub(int a,int b);
}
@FunctionalInterface
interface Multiplication{
	int mul(int a,int b);
}
@FunctionalInterface
interface Division{
	int div(int a,int b);
}
