
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
	
}
