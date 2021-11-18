
public class Prgm2 {

	public static void main(String[] args) {
		
		Order myOrder=(price,status)->{
			
			if(price>10000)
			{
				if(status=="Accepted" || status=="Completed")
				{
					System.out.println("Result-----------------------");
					System.out.println("Order is printed");
					System.out.println("-----------------------------");
				}
			}
			else
			{
				System.out.println("Result-----------------------");
				System.out.println("Order is not printed.");
				System.out.println("-----------------------------");
			}
		};
		myOrder.showResult(13000,"Completed");
		myOrder.showResult(9000,"Accepted");
		myOrder.showResult(13000,"Completed");
		myOrder.showResult(13000,"Accepted");
	}

}

interface Order{
	
	void showResult(int price,String orderStatus);
}
