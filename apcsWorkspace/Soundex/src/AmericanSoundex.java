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
						
		char[] nameCharList = name.toCharArray();
		
		/*Adds soundex values for all letters*/
		for (int i = 0; i < nameCharList.length; i++){
			soundex += getSoundexVal(nameCharList[i]);
		}
		
		/*Remove duplicate numbers*/
		String newsoundex = "";
		
		for (int i = 0; i < nameCharList.length; i++){
			if (i == 0){
				newsoundex += nameCharList[0];
			} 
			else if (getSoundexVal(nameCharList[i]) != getSoundexVal(nameCharList[i-1])){
				newsoundex += getSoundexVal(nameCharList[i]);
				System.out.println("The number " + nameCharList[i] + " is added to the soundex because this soundex val is " + getSoundexVal(nameCharList[i]) + " and the previous letter's value is " + getSoundexVal(nameCharList[i-1]));
			} else {
				System.out.println("The duplicate number " + nameCharList[i] + " was skipped at index " + i);
			}
		}
		
		System.out.println(newsoundex);
		soundex = newsoundex;
		System.out.println("Raw soundex is " + soundex);
		
		if (soundex.length() < 4){
			//Fill in with 0's
//			System.out.println("The soundex is too short and will be filled with 0's");
			for(int fillLen = 4 - soundex.length(); fillLen > 0; fillLen--){
				soundex += "0";
			}
		} else if (soundex.length() > 4){
			//Truncate to 4 digits
//			System.out.println("The soundex is too long, it will be truncated to 1 letter and 3 numbers");
			soundex = soundex.substring(0, 4);
		}
		
		soundex = soundex.toUpperCase();
		
		return soundex;
	}
	
	private static String getSoundexVal(char soundexChar){
		
		String soundexVal = "";
		
		if (soundexChar == 'a'
				|| soundexChar == 'e'
				|| soundexChar == 'i'
				|| soundexChar == 'o'
				|| soundexChar == 'u'
				|| soundexChar == 'y'
				|| soundexChar == 'h'
				|| soundexChar == 'w'){
//			System.out.println("Skip the letter " + soundexChar + " at index " + i);	
			/*Do nothing*/
		} else if (soundexChar == 'b'
				|| soundexChar == 'f'
				|| soundexChar == 'p'
				|| soundexChar == 'v'){
			soundexVal = "1";
//			System.out.println("Because index " + i + " is " + soundexChar + ", the number 1 was added to soundexList");
		} else if (soundexChar == 'c'
				|| soundexChar == 'g'
				|| soundexChar == 'j'
				|| soundexChar == 'k'
				|| soundexChar == 'q'
				|| soundexChar == 's'
				|| soundexChar == 'x'
				|| soundexChar == 'z'){
			soundexVal = "2";
//			System.out.println("Because index " + i + " is " + soundexChar + ", the number 2 was added to soundexList");
		} else if (soundexChar == 'd' || soundexChar == 't'){
			soundexVal = "3";
//			System.out.println("Because index " + i + " is " + soundexChar + ", the number 3 was added to soundexList");
		} else if (soundexChar == 'l'){
			soundexVal = "4";
//			System.out.println("Because index " + i + " is " + soundexChar + ", the number 4 was added to soundexList");
		} else if (soundexChar == 'm' || soundexChar == 'n'){
			soundexVal = "5";
//			System.out.println("Because index " + i + " is " + soundexChar + ", the number 5 was added to soundexList");
		}else if (soundexChar == 'r'){
			soundexVal = "6";
//			System.out.println("Because index " + i + " is " + soundexChar + ", the number 6 was added to soundexList");
		}
				
		return soundexVal;
		
	}
}
