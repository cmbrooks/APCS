/* Exercise 2.2. 2014-09-25
 * Cody Brooks
 */
public class recursion_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(fact(6));

	}
	

  	public static int fact(int n){
		int nfact;
		if (n == 0){
			nfact = 1;
			return nfact;
		}else{
			nfact = n*fact(n-1);
		}
		return nfact;
	}

	
	public static void ack (int m, int n){
		
	}

}
