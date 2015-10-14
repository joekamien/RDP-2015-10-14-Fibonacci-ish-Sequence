import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Handle input
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextBigInteger()){
			System.out.println(Fib.sequence(scanner.nextBigInteger()));
		}
		scanner.close();
	}

}
