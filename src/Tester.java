import static org.junit.Assert.*;

import org.junit.Test;

@SuppressWarnings("unused")
public class Tester {

	@Test
	public void test() {
		assert(Fib.contains(1, 2));
		assert(Fib.contains(2000, 0));
		assert(Fib.contains(3, 9));
		assert(Fib.contains(1, 9) == false);
		assert(Fib.findLowestValAt1(9) == 3);
		assert(Fib.findLowestValAt1(84) == 4);
		System.out.println(Fib.sequence(9));
		System.out.println(Fib.sequence(21));
		System.out.println(Fib.sequence(84));
		System.out.println(Fib.sequence(578));
		System.out.println(Fib.sequence(123456789));
	}

}
