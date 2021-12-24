
final class Singletone
{
	public void test()
	{
		System.out.println("Singletone is final super class");
	}
}
//cannot extends Singletone because its prefixed with final
/*class Singleton2 extends Singletone 
{
	
}*/
public class Prgm1 {
	public static void main(String[] args) {
		Singletone st= new Singletone();
		st.test();
	}

}
