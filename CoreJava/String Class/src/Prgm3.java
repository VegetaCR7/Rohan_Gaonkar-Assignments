
public class Prgm3 {

	public static void main(String[] args) {
		String str="Java String pool refers to collection of Strings which are stored in heap memory";
		
		//1.
		System.out.println(str.toLowerCase());
		//2.
		System.out.println(str.toUpperCase());
		//3.
		System.out.println(str.replace('a', '$'));
		//4.
		System.out.println(str.contains("collection"));
		//5.
		String str2="java string pool refers to collection of strings which are stored in heap memory";
		System.out.println(str.equals(str2));
		//6.
		System.out.println(str==str2);
	}

}
