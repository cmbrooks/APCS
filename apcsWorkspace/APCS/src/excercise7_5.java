
public class excercise7_5 {

	public static void main(String[] args) {
		
		int x = 1;
		int i = 0;
		double e = 1.0;
		
		while(i <= x){
			e = e + (myexp(x,i)/fact(i));
			i++;
		}
		
		System.out.println("e^" + x+ " is: " + e);
		
	}

	
	public static double myexp(int x, int y){ //Tested
		double exp = x;
		while(y > 1){
			exp = exp*x;
			y--;
		}
		return exp;
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
