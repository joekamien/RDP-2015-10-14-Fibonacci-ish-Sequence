import static org.junit.Assert.*;

import java.math.BigInteger;

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
		
		//test for biginteger
		
		assert(Fib.contains(BigInteger.ONE, new BigInteger("2")));
		assert(Fib.contains(new BigInteger("2000"), BigInteger.ZERO));
		assert(Fib.contains(new BigInteger("3"), new BigInteger("9")));
		assert(Fib.contains(new BigInteger("1"), new BigInteger("9")) == false);
		assert(Fib.findLowestValAt1(new BigInteger("9")).compareTo(new BigInteger("3")) == 0);
		assert(Fib.findLowestValAt1(new BigInteger("84")).compareTo(new BigInteger("4")) == 0);
		
		//printouts
		System.out.println(Fib.sequence(9));
		System.out.println(Fib.sequence(21));
		System.out.println(Fib.sequence(84));
		System.out.println(Fib.sequence(578));
		System.out.println(Fib.sequence(123456789));
		System.out.println(Fib.sequence(new BigInteger("38695577906193299")));
		
	}

}
