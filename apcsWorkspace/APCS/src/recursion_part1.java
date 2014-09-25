/* Exercise 2.2. 2014-09-25
 * Cody Brooks
 */
public class recursion_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Factoral of 6: " + fact(6));
		System.out.println("Fibonacci of 8: " + fib(8));
		System.out.println("Ackermann of 2 and 3: " + ack(2, 3));

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
