
public class excercise7_5 {

	public static void main(String[] args) {
		
		double a = 3.0;
		double b = 5.0;
		double c = 2.55;
		double d = 16.0;
		double e = 8.0;
		
		check(a);
		System.out.println("");
		check(b);
		System.out.println("");
		check(c);
		System.out.println("");
		check(d);
		System.out.println("");
		check(e);
		
	}

	
	public static double myexp(double x){ //Tested
		
		double i = 1;
		int n = 15;
		double e = 0;
		double result;
		
		while(i < n){
			result = Math.pow(x,i)/fact((int)i);
			e += result;
			i++;
		}
	
		return e;
		
	}


	public static double myexp2(double x){ //Tested
		
		double i = 1;
		double e = 1;
		int n = 15;
		double xn;
		double xni = 1;
		
		while(i < n){
			xn  = xni*(x/i);
			e += xn;
			xni = xn;
			i++;
		}
		
		return e;
	
	}	
	
	
	public static void check(double x){
		System.out.print("x: ");
		System.out.print(x);
		System.out.print("\n");
		System.out.print("Using (x^i)/i!: ");
		System.out.print(myexp(x));
		System.out.print("\n");
		System.out.print("Using Xn-1*(x/1): ");
		System.out.print(myexp2(x));
		System.out.print("\n");
		System.out.print("The actual value of e^" + x + " is: ");
		System.out.print(Math.exp(x));
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