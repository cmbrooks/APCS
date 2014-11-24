/**
 * An optimized implementation of the Sieve of Eratosthenes algorithms to find
 * all the prime numbers from 2 to a number n.
 * 
 * For details, refer to http://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
 * 
 * @author Ronghui Liang
 *
 */
public class EratosthenesSieve {

	public static void main(String[] args) {

		int n = 0;
		if (args != null && args.length > 0) {
			try {
				n = Integer.parseInt(args[0]);
			} catch (NumberFormatException e) {
				System.out.println("NumberFormatException " + e.getMessage());
				System.out.println("Usage: java EratosthenesSieve n.");
				return;
			}
		} else {
			// default test 2 to 1000
			n = 1000;
		}

		try {
			boolean[] A = sievePrimes(n);
			output(A);
		} catch (IllegalArgumentException illexp) {
			System.out.println(illexp.getMessage());
		}
	}

	/**
	 * Siveve for prime numbers from 2 to input n.
	 * 
	 * @param n Integer number 
	 *  Precondition: 2 <= n <= 1000000
	 * @return A Boolean array 
	 *  Postcondition: 
	 *         true = the array index is a prime
	 *         false = the array index is not a prime
	 * @exception IllegalArgumentException
	 */
	static boolean[] sievePrimes(int n) throws IllegalArgumentException {

		// Ensure input n is in the range of 2 to 1000,000
		if (n < 2 || n > 1000000) {
			throw new IllegalArgumentException(
					"sievePrimes(): IllegalArgumentException - n must be a number between 2 to 1000,000.");
		}

		// increment 1 to include n in the sieve
		n++;

		boolean[] A = new boolean[n];

		// initialize the array elements to true
		for (int i = 0; i < n; i++) {
			A[i] = true;
		}

		// get search upper bound
		int nSqrt = (int) (Math.sqrt(n) + 0.5);

		// check for each number up to nSqrt
		for (int i = 2; i <= nSqrt; i++) {
			if (A[i]) {
				// find more non-prime numbers starting at the square of i
				int start = i * i;
				for (int j = start, k = 1; j < n; j = start + k * i, k++) {
					A[j] = false;
				}
			}
		}

		return A;
	}

	/**
	 * Output the prime numbers 2 to n (array indeces) where the boolean value
	 * is true.
	 * 
	 * @param A Boolean arrays 
	 *  Precondition: 
	 *  A has already been marked for prime numbers using the sievePrimes() method.
	 * 
	 */
	static void output(boolean[] A) {
		for (int i = 2; i < A.length; i++) {
			if (A[i]) {
				System.out.print(i + " ");
			}
		}
	}

}
