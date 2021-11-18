import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Prgm3 {

	public static void main(String[] args) {
		Supplier<Integer> maximum=()-> Math.max(2, 5);
		Predicate<Integer> lesserThan=i->(i<69);
		Consumer<Integer> display=(i)->System.out.println(i);
		Function<Integer,Double> half =(a)->a/2.0;
		
		System.out.println("Supplier interface");
		System.out.println(maximum.get());
		System.out.println("-------------------");
		System.out.println("Predicate interface");
		System.out.println(lesserThan.test(60));
		System.out.println("-------------------");
		System.out.println("Consumer interface");
		display.accept(17);
		System.out.println("-------------------");
		System.out.println("Function interface");
		System.out.println(half.apply(52));
		System.out.println("-------------------");
	}

}