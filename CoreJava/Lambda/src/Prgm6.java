import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

public class Prgm6 {

	public static void main(String[] args) {
		List<String> li=new ArrayList<>();
		li.add("Naruto");
		li.add("Itachi");
		li.add("Madara");
		li.add("Shishui");
		System.out.println("Elements in list are:");
		li.forEach(i->System.out.println(i));
		System.out.println("----------------------------------------------------------------");
		li.replaceAll(new MyOperator());
		System.out.println("Elements in list after replacing with upper case letters are:");
		li.forEach(i->System.out.println(i));
	}

}

class MyOperator implements UnaryOperator<String>
{
	@Override
	public String apply(String t) 
	{
		return t.toUpperCase();
	}
}
