/**
 * 
 * This class implements the American Soundex phonetic algorithm as 
 * described in  http://en.wikipedia.org/wiki/Soundex
 *
 */
public class AmericanSoundex {

	/**
	 * This method returns the American Soundex code for a given String name.
	 * 
	 * The Soundex code for a name consists of a letter followed by three numerical digits: 
	 * the letter is the first letter of the name, and the digits encode the remaining 
	 * consonants. Similar sounding consonants share the same digit so, for example, 
	 * the labial consonants B, F, P, and V are each encoded as the number 1.
	 *  
	 *	The correct value can be found as follows:
	 *
	 	1. Retain the first letter of the name and drop all other occurrences of 
	 *     a, e, i, o, u, y, h, w.
	    2. Replace consonants with digits as follows (after the first letter):
	 *     b, f, p, v -> 1
	 *     c, g, j, k, q, s, x, z -> 2
	 *     d, t -> 3
	 *     l -> 4
	 *     m, n -> 5
	 *     r -> 6
        3. If two or more letters with the same number are adjacent in the original 
     *     name (before step 1), only retain the first letter; also two letters with 
     *     the same number separated by 'h' or 'w' are coded as a single number, 
     *     whereas such letters separated by a vowel are coded twice. This rule also 
     *     applies to the first letter.
	    4. Iterate the previous step until you have one letter and three numbers. 
	 *     If you have too few letters in your word that you can't assign three numbers, 
	 *     append with zeros until there are three numbers. If you have more than 3 letters, 
	 *     just retain the first 3 numbers.
	 * 
	 * 
	 * @param name - a String name to be encoded using the American Soundex algorithm
	 * @return - a String soundex code
	 */
	public static String getSoundex( String name ) {
		String soundex = "";
				
		// TODO:
		// Implement the soundex algorithm here.
		// If you need a helper method for part of the algorithm, you may create a 
		// private static method. 
		//
		
//		char[] soundexList = new char[10];
		char[] nameCharList = name.toCharArray();
		soundex = soundex + nameCharList[0];
		System.out.println("First letter is '" + soundex + "'");
		
		System.out.print("Word is '");
		System.out.print(nameCharList);
		System.out.println("'");
		
		/*Removes all first tier letters*/
		for(int i = 0; i < name.length(); i++){
			if (nameCharList[i] == 'a'
					|| nameCharList[i] == 'e'
					|| nameCharList[i] == 'i'
					|| nameCharList[i] == 'o'
					|| nameCharList[i] == 'u'
					|| nameCharList[i] == 'y'
					|| nameCharList[i] == 'h'
					|| nameCharList[i] == 'w'){
				System.out.println("Remove the letter " + nameCharList[i] + " at index " + i);
				/*TODO:
				 * Add code that removes the letter at a given index
				*/			
			} else if (nameCharList[i] == 'b'
						|| nameCharList[i] == 'f'
						|| nameCharList[i] == 'p'
						|| nameCharList[i] == 'v'
					){
				soundex.concat("1");
				System.out.println("Because index " + i + " is " + nameCharList[i] + ", the number 1 was added to soundexList");
				System.out.println("Current soundex is: " + soundex);
			} else if (nameCharList[i] == 'c'
						|| nameCharList[i] == 'g'
						|| nameCharList[i] == 'j'
						|| nameCharList[i] == 'k'
						|| nameCharList[i] == 'q'
						|| nameCharList[i] == 's'
						|| nameCharList[i] == 'x'
						|| nameCharList[i] == 'z'
					){
				soundex.concat("2");
				System.out.println("Because index " + i + " is " + nameCharList[i] + ", the number 2 was added to soundexList");
				System.out.println("Current soundex is: " + soundex);
			} else if (nameCharList[i] == 'd' || nameCharList[i] == 't'){
				soundex.concat("3");
				System.out.println("Because index " + i + " is " + nameCharList[i] + ", the number 3 was added to soundexList");
				System.out.println("Current soundex is: " + soundex);
			} else if (nameCharList[i] == 'l'){
				soundex.concat("4");
				System.out.println("Because index " + i + " is " + nameCharList[i] + ", the number 4 was added to soundexList");
				System.out.println("Current soundex is: " + soundex);
			} else if (nameCharList[i] == 'm' || nameCharList[i] == 'n'){
				soundex.concat("5");
				System.out.println("Because index " + i + " is " + nameCharList[i] + ", the number 5 was added to soundexList");
				System.out.println("Current soundex is: " + soundex);
			}else if (nameCharList[i] == 'r'){
				soundex.concat("6");
				System.out.println("Because index " + i + " is " + nameCharList[i] + ", the number 6 was added to soundexList");
				System.out.println("Current soundex is: " + soundex);
			}
			
		}
		
		System.out.println("The current soundex is: " + soundex);
		
		return soundex;
	}
}
