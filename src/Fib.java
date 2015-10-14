import java.math.BigInteger;

public class Fib {
	
	public static boolean contains(int valat1, int target){
		if(target == 0 || target == valat1) return true;
		if(valat1 <= 0 || target < 0) throw new IllegalArgumentException("Value at 1 and target must be positive");
		
		int valat0 = 0;
		
		while(true){
			int current = valat0 + valat1;
			if(current == target){
				return true;
			}
			else if(current > target){
				return false;
			}
			
			//increment for next iteration
			valat0 = valat1;
			valat1 = current;
		}
	}
	
	public static int findLowestValAt1(int target){
		for(int i = 1; i < target; i ++){
			if(Fib.contains(i, target)){
				return i;
			}
		}
		
		return target;
	}
	
	public static String sequence(int target){
		if(target == 0) return "0";
		
		int valat1 = Fib.findLowestValAt1(target);
		String ret = "0 " + valat1 + " ";
		if (target == valat1) return ret.trim();
		
		int valat0 = 0;
		int current = valat0 + valat1;
		do{
			ret += current + " ";
			valat0 = valat1;
			valat1 = current;
			current = valat0 + valat1;
		}while (current <= target);
		
		return ret.trim();
	}
	
	public static String sequence(BigInteger target){
		if (target.compareTo(new BigInteger("2147483647")) < 0) return sequence(target.intValue());
		
		//this actually does need to be handled as a big integer
		
		BigInteger valat1 = Fib.findLowestValAt1(target);
		String ret = "0 " + valat1 + " ";
		if (target.equals(valat1)) return ret.trim();
		
		BigInteger valat0 = BigInteger.ZERO;
		BigInteger current = valat0.add(valat1);
		do{
			ret += current + " ";
			valat0 = valat1;
			valat1 = current;
			current = valat0.add(valat1);
		}while (current.compareTo(target) <= 0);
		
		return ret.trim();
	}
	
	//Handle BigInteger situation
	public static boolean contains(BigInteger valat1, BigInteger target){
		if(target.compareTo(BigInteger.ZERO) == 0 || target.compareTo(valat1) == 0) return true;
		if(valat1.compareTo(BigInteger.ZERO) <= 0 || target.compareTo(BigInteger.ZERO) < 0) throw new IllegalArgumentException("Value at 1 and target must be positive");
		
		BigInteger valat0 = BigInteger.ZERO;
		
		while(true){
			BigInteger current = valat0.add(valat1);
			if(current.compareTo(target) == 0){
				return true;
			}
			else if(current.compareTo(target) > 0){
				return false;
			}
			
			//increment for next iteration
			valat0 = valat1;
			valat1 = current;
		}
	}
	
	public static BigInteger findLowestValAt1(BigInteger target){
		for(BigInteger i = BigInteger.ONE; i.compareTo(target) < 0; i = i.add(BigInteger.ONE)){
			if(Fib.contains(i, target)){
				return i;
			}
		}
		
		return target;
	}
	
}
