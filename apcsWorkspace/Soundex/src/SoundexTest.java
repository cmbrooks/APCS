/*
Cody Brooks
2014-11-11
*/

public class SoundexTest {

	public static void main(String[] args) {

		// Run unit test to verify that the getLastNames() method is correct
		getLastNamesTest();

		// Run unit test to verify that the getSoundex() method correct
		getSoundexTest();


		// retrieve a list of the U.S. presidents' last names
		String[] lastNames = USPresidentNames.getLastNames();
		String[] soundex   = getUSPresidentSoundex();

		// now print out the last names and soundex code
		printUSPresidents(lastNames, soundex);

	}

	/**
	 * Unit Test USPresidentNames.getLastNames() method.
	 */
	public static void getLastNamesTest() {
		// retrieve a list of the U.S. presidents' last names
		String[] lastNames = USPresidentNames.getLastNames();

		// Field names
		System.out.println("No.   \tLast Names ");

		for (int i = 0; i < lastNames.length; i++) {
			System.out.println(String.valueOf(i+1) + "\t" + lastNames[i]);
		}
		System.out.println();
	}

	/**
	 * Unit Test: Implemented a number of test cases to test the getSoundex() method.
	 */
	public static void getSoundexTest() {
		// Test case 1
		if (AmericanSoundex.getSoundex("Robert").equals("R163") &&
			AmericanSoundex.getSoundex("Rupert").equals("R163") &&
			AmericanSoundex.getSoundex("Rubin").equals("R150")) {
			System.out.println("Robert, Rupert and Robin Test: Passed.");
		} else{
			System.out.println("Robert, Rupert and Robin Test: Failed.");
		}

		// Test case 2
		if (AmericanSoundex.getSoundex("Ashcraft").equals("A261") &&
		    AmericanSoundex.getSoundex("Ashcroft").equals("A261")) {
			System.out.println("Ashcraft and Ashcroft Test: Passed.");
		} else {
			System.out.println("Ashcraft and Ashcroft Test: Failed.");
		}

		// Test case 3
		if (AmericanSoundex.getSoundex("Tymczak").equals("T522")) {
			System.out.println("Tymczak Test: Passed.");
		} else {
			System.out.println("Tymczak Test: Failed.");
		}

		// Test case 4
		if (AmericanSoundex.getSoundex("Pfister").equals("P236")) {
			System.out.println("Pfister Test: Passed.");
		} else {
			System.out.println("Pfister Test: Failed.");
		}
		System.out.println();
	}

	/**
	 * Return the American Soundex code for all U.S. presidents' last names
	 * in the same order as the U.S. presidents.
	 *
	 * @return String array of the soundex code
	 */
	public static String[] getUSPresidentSoundex() {

		// TODO:
		// (1) Create a new String array which will be used to store the soundex code
		// (2) Invoke the getNames() method from USPresentNames to get an array
		//     of the last names.
		// (3) For each of the last names in the array, call  the AmericanSoundex's
		//     getSoundex() method to encode the string.
		// (4) Store the code to the soundex String array in the same order of the last names
		// (5) return the sourdex code array
		//

    String[] presList = USPresidentNames.getLastNames();
    String[] presSoundex = new String[presList.length];

    for (int i = 0; i < presSoundex.length; i++) {
      presSoundex[i] = AmericanSoundex.getSoundex(presList[i]);
    }

		return presSoundex;
	}


	/**
	 * Print a list of the U.S. Presents in the following format:
	 *
	 *      No.		Last Names		American Soundex Code
	 *      1 		Washington		Wxxx
	 *      2		Adams			Axxx
	 *      ... ...
	 *
	 *  (Hint: Array index starts with 0, so you will need to adjust it for the No. column)
	 *  (Hint: Use "\t" to print a tab)
	 *
	 *  @param lastNames - String array of U.S. President last names
	 *  @param soundex   - String array of the soundex code of the last names
	 */
	public static void printUSPresidents(String[] lastNames, String[] soundex) {
		// Field names
		System.out.println("No.   \tLast Names       \tSoundexAnswer Code");

		// TODO
		// Traverse the the lastNames and soundex arrays and print the values under the respective field names.

    for (int j = 0; j < lastNames.length; j++) {
      System.out.print("No. " + (j+1));
      System.out.print("\t");
      System.out.print("Last Name: ");
      System.out.print(lastNames[j]);
      System.out.print("\t");
      System.out.print("Soundex Code: ");
      System.out.println(soundex[j]);
    }

	}

}
