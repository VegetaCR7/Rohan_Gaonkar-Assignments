abstract class AbstrTest{
	
	abstract public void demoTest();
}
class AbTest extends AbstrTest{

	public void demoTest() {
		System.out.println("Method Overriden");
	}
}
public class Prgm4 {

	public static void main(String[] args) {
		AbstrTest at=new AbTest();
		at.demoTest();
	}
}
