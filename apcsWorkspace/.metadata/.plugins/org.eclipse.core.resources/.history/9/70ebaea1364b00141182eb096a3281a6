
public class excercise7_5 {

	public static void main(String[] args) {
		
		int x = 3;
		int i = x;
		double e = 1.0;
		double e_eff;
		
		if (myexp(x,i,e) == effexp){
			System.out.println("Both ways of calculating e^x are equal in value");
		}else{
			System.out.println("You done goofed somwhere");
		}
		
	}

	
	public static void myexp(double x, int i, double e){ //Tested
		while(i > 0){
			e = e + (Math.pow(x,i)/fact(i));
			i--;
		}
		System.out.println("e^" + x+ " is: " + e);
	}
	
	
	public static void effexp(double x, int i, double e){
		while (i > 0){
			e = e + e*(x/i);
			i--;
		}
		System.out.println ("A more efficient way to calculate e^" + x + "is: " + e);
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
