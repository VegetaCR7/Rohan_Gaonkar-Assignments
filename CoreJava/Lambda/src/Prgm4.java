import java.util.ArrayList;
import java.util.List;

public class Prgm4 {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("Naruto");
		li.add("Itachi");
		li.add("Madara");
		li.add("Shishui");
		
		System.out.println("Elements in the list are:");
		li.forEach(i->System.out.println(i));
		System.out.println("------------------------------------------");
		
		li.removeIf(a->(a.length()%2 !=0));
		System.out.println("Elements in the list with odd lengths are:");
	
		li.forEach(i->System.out.println(i));
	}

}
