abstract class Employee
{
	int sal=24000;

	abstract public int calculateSalary();
}
class Manager extends Employee
{
	int incentive;
	
	public Manager(int incentive) {
		super();
		this.incentive = incentive;
	}

	@Override
	public int calculateSalary() {
		sal=sal+incentive;
		return sal;
	}
}
class Labour extends Employee
{
	int overTime;
	
	public Labour(int overTime) {
		super();
		this.overTime = overTime;
	}

	@Override
	public int calculateSalary() {
		sal=sal+(overTime*2);
		return sal;	
	}
}
public class Prgm2 {
	public static void main(String[] args) {
		Employee emp1=new Manager(5000);
		int mSal=emp1.calculateSalary();
		System.out.println("Manager's Salary is "+mSal);
		Employee emp2=new Labour(300);
		int lSal=emp2.calculateSalary();
		System.out.println("Labour's Salary is "+lSal);
		
		//System.out.println("Total salary of all employee's is "+(mSal+lSal));	
	}
}
