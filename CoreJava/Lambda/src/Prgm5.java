import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Prgm5 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();
		Consumer<String> letter=(s)->
			{
				sb.append(s.charAt(0)); 
			};
		List<String> li=new ArrayList<>();
		li.add("Naruto");
		li.add("Itachi");
		li.add("Madara");
		li.add("Shishui");
		li.forEach(i->System.out.println(i));
		System.out.println("------------------------------------------");
		for (Iterator<String> itr = li.iterator(); itr.hasNext();) 
		{
			String string = (String) itr.next();
			letter.accept(string);
			
		}
		System.out.println(sb);
	}

}
