
public class sieve_of_eratosthenes {

	public static void main(String[] args) {

		int largestNumber = 100;
		boolean[] numberStatus = new boolean[largestNumber+1];
		int p = 1;
		
		//Initialize array as all numbers are prime (true)
		for(int i = 0; i <= numberStatus.length-1; i++){
			numberStatus[i] = true;
		}
		
		//Find the next value of p (The next true index)
		for(int j = p+1; j <= numberStatus.length; j++){
			if(numberStatus[j]){
				p = j;
				//Mark all multiples of p as false
				for(int i = 2*p; i <= numberStatus.length; i = p+i){
					System.out.println("Remove: " + i);
					numberStatus[i-2] = false;
				}
			}
		}

		//Print all elements in array
//		System.out.println("");
//		System.out.println("Final Array:");
//		for(int i = 0; i <= numberStatus.length-1; i++){
//			System.out.println(i + ": " + numberStatus[i]);
//		}
		
		//Print all prime numbers in range
		System.out.println("");
		System.out.println("Prime Numbers:");
		for(int i = 0; i <= numberStatus.length-1; i++){
			if(numberStatus[i] == true){
				System.out.println(i);
			}
		}
		
	}

}
