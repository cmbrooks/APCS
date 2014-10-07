
public class excercise7_5 {

	public static void main(String[] args) {
		
		double x = 3.0;
		
		myexp(x);
		System.out.println("");
		myexp2(x);
		System.out.println("");
		check(x);
		
	}

	
	public static double myexp(double x){ //Tested
		
		double i = 0;
		double e = 0;
		
		while(i <= x){
//			System.out.print("i: " + i + "\t" + "old e: " + e);
			e = e + ((Math.pow(x,i))/fact((int)i));
			System.out.println("Math.pow(x,i)/fact(i): " + (Math.pow(x,i)/fact((int)i)));
//			System.out.println("\t" + "new e: " + e);
			i++;
		}
		
		System.out.println("e^" + x + " using Math.pow and fact() is: " + e);
		return e;
		
	}


	public static double myexp2(double x){ //Tested
		
		double xdivi;
		double i = 1;
		double e = 1;
		
		while(i <= x){
			xdivi = x/i;
			System.out.print("i: " + i + "\t" + "old e: " + e + "\t" + "x: " + x + "\t" + "x/i: " + xdivi);
			e = e + (e*xdivi);
			System.out.println("\t" + "new e: " + e);
			i++;
		}
		
		System.out.println("e^" + x + " using e*(x/i) is: " + e);
		return e;
	
	}	
	
	
	public static void check(double x){
		System.out.print("x: ");
		System.out.print(x);
		System.out.print("\t");
		System.out.print(myexp2(x));
		System.out.print("\t");
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