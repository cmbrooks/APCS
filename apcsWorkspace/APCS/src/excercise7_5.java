
public class excercise7_5 {

	public static void main(String[] args) {
		
		int x = 3;
		int i = x;
		double e = 1;
		
		while(i > 0){
			e = e + (myexp(x,i)/fact(x));
			i--;
		}
		
		System.out.println("e^" + x+ " is: " + e);
	}

	
	public static int myexp(int x, int y){ //Tested
		int exp = x;
		while(y > 1){
			exp= exp*x;
			y--;
		}
		return exp;
	}
	
	
  	public static int fact(int n){ //Tested
		int result;
		if (n == 0){
			result = 1;
			return result;
		}else{
			result = n*fact(n-1);
		}
		return result;
	}
	
}
