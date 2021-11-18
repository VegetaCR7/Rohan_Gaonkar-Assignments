import java.util.HashMap;
import java.util.Map.Entry;

public class Prgm7 {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<>();
		StringBuilder sb=new StringBuilder();
		hs.put(1,"Naruto");
		hs.put(2,"Itachi");
		hs.put(3,"Madara");
		hs.put(4,"Shishui");
		
		System.out.println("The elements in the hashmap are:");
		System.out.println(hs);
		System.out.println("-----------------------------------------------------------------");
		System.out.println("After converting entire hashmap into a string, the result is:");
		for (Entry<Integer, String> m:hs.entrySet()) 
		{
			sb.append(m);
		}
		System.out.println(sb);
	}

}
