
public class excercise7_5 {

	public static void main(String[] args) {
		
		int x = 3;
		int i = x;
		double e = 1.0;
//		double e_eff;
		
		myexp(x,i,e);
		
	}

	
	public static double myexp(double x, int i, double e){ //Tested
		while(i >+ 0){
			System.out.print(i + "\t" + e);
			e = e + (Math.pow(x,i)/fact(i));
			
			System.out.println("\t" + e);
			i--;
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
