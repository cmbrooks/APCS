
public class excercise7_5 {

	public static void main(String[] args) {
		
		int x = 3;
		int i = 0;
		double e = 0.0;
//		double e_eff;
		
		myexp(x,i,e);
		
	}

	
	public static double myexp(double x, int i, double e){ //Tested
		while(i <= x){
			System.out.print("i: " + i + "\t" + "old e: " + e);
			e = e + (Math.pow(x,i)/fact(i));
			
			System.out.println("\t" + "new e: " + e);
			i++;
		}
		System.out.println("e^" + x + " is: " + e);
		return e;
	}
	
	
  	public static double fact(int n){ //Tested
		double result;
		if (n == 0){
			result = 1;
			return result;
		}else{
			result = n*fact(n-1);
		}
		return result;
	}
	
}
