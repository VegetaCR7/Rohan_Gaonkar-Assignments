
public class Prgm6 {

	public static void main(String[] args) {
		Persistence fp=new FilePersistence();
		fp.persist();
		System.out.println("------------------------------------------");
		Persistence dp=new DatabasePersistence();
		dp.persist();
	}

}
abstract class Persistence{
	abstract public void persist();
}

class FilePersistence extends Persistence{
	public void persist()
	{
		System.out.println("Data is saved in File.");
	}
}

class DatabasePersistence extends Persistence{
	public void persist()
	{
		System.out.println("Data is saved in Database.");
	}
}
