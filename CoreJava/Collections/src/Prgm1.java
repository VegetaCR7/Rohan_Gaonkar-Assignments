import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Prgm1 {

	public static void main(String[] args) {
		Map<Long,Contact> m=new HashMap<>();
		m.put(9988776622l,new Contact("Unkown","anonymous@abc.com",Contact.Gender.Female));
		m.put(1122553388l,new Contact("Anony","qaz@xyz.com",Contact.Gender.Male));
		m.put(9988776622l, new Contact("Me", "Its me@qaz.com",Contact.Gender.Others));
		Set<Long> keys=m.keySet();
		System.out.println("Keys:-");
		for(long i:keys)
		{
			System.out.println(i);
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Values:-");
		for(long i:keys)
		{
			System.out.println(m.get(i));
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("Key and Value-");
		System.out.println(m);
	}

}

class Contact{
	
	long phoneNo;
	String name;
	String email;
	private Contact.Gender gen;
	enum Gender{
		Male,Female,Others
	}
	
	public Contact(String name, String email ,Gender gen) {
		super();
		this.name = name;
		this.email = email;
		this.gen=gen;
	}
	@Override
	public String toString() {
		return "Contact [name=" + name + ", email=" + email + ", gen=" + gen + "]";
	}
	
}
