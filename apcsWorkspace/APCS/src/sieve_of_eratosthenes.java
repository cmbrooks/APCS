
public class sieve_of_eratosthenes {

	public static void main(String[] args) {

		int largestNumber = 100;
		int arraySize = largestNumber - 1;
		int[] numberList = new int[arraySize];
		int p = 2;

		
		//Fill array with numbers from 0 to the array size
		for(int i = 2; i <= arraySize+1; i++){
			numberList[i-2] = i;
		}
		
		//Remove non-prime numbers
		for(int i = 2*p; i <= arraySize+1; i = p+i){
			System.out.println("Remove: " + i);
			for(int j = i-1; j <= numberList.length - 1; j+=2){
				numberList[j-1] = numberList[j];
			}

//			nPrimeList[nprimeIndex] = i;
//			nprimeIndex++;
		}
		
		//Print all elements in array
		System.out.println("");
		System.out.println("Final Array:");
		for(int i = 0; i <= numberList.length - 1; i++){
			System.out.println(numberList[i]);
		}
		
	}

}
