/* Exercise 2.2. 2014-09-25
 * Cody Brooks
 */

public class recursion_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int m = 2;
		int n = 3;
		
		System.out.println("Factoral of "+ x + ": " + fact(n));
		System.out.println("Fibonacci of "+ x + ": " + fib(n));
		System.out.println("Ackermann of " + m + " and " + n + ": " + ack(m, n));

	}

	
  	public static int fact(int n){
		int result;
		if (n == 0){
			result = 1;
			return result;
		}else{
			result = n*fact(n-1);
		}
		return result;
	}

  	
  	public static int fib(int x){
  		int result;
  		if (x == 0){
  			return 0;
  		}else if(x == 1){
  			return 1;
  		}else{
  			result = fib(x-1) + fib(x-2);
  		}
  		return result;
  	}
  	
	
	public static int ack(int m, int n){
		int result;
		if(m == 0){
			result = n+1;
		}else if(m > 0 && n == 0){
			result = ack((m-1), 1);
		}else{
			result = ack(m-1, ack(m, n-1));
		}
		return result;
	}

}
