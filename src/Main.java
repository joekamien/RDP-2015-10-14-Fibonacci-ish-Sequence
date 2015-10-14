import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Handle input
		Scanner scanner = new Scanner(System.in);
		if(scanner.hasNextInt()){
			System.out.println(Fib.sequence(scanner.nextInt()));
		}
		scanner.close();
	}

}
