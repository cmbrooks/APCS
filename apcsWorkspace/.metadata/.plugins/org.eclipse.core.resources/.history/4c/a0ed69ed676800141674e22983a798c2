/*
Cody Brooks
2014-11-06
*/

public class AmericanSoundex {

	public static String getSoundex( String name ) {

		String soundex = "";

		name = name.toLowerCase();
		char[] nameCharList = name.toCharArray();


		/*Adds soundex values for all letters*/
		for (int i = 0; i < nameCharList.length; i++){
			soundex += getSoundexVal(nameCharList[i]);
		}
		System.out.println("Raw soundex is " + soundex);

		/*Remove duplicate numbers*/
		String newsoundex = "";
		char[] soundexList = soundex.toCharArray();

		for (int i = 0; i < soundex.length(); i++){
			if (newsoundex.length() > 0 && soundexList[i-1] == soundexList[i]) {
				if (isVowel(soundexList[i-1])){
					newsoundex += soundexList[i];
				}
			} else {
				newsoundex += soundexList[i];
			}
		}

		soundex = newsoundex;
		System.out.println("Un-truncated soundex is " + soundex);


		/*Replace the first character in the string with the first letter of the word*/
		soundex = nameCharList[0] + soundex.substring(1, soundex.length());

		if (soundex.length() < 4){
			/*Fill in with 0's*/
			for(int fillLen = 4 - soundex.length(); fillLen > 0; fillLen--){
				soundex += "0";
			}
		} else if (soundex.length() > 4){
			/*Truncate to 4 digits*/
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
			soundexVal = "";
		} else if (soundexChar == 'b'
				|| soundexChar == 'f'
				|| soundexChar == 'p'
				|| soundexChar == 'v'){
			soundexVal = "1";
		} else if (soundexChar == 'c'
				|| soundexChar == 'g'
				|| soundexChar == 'j'
				|| soundexChar == 'k'
				|| soundexChar == 'q'
				|| soundexChar == 's'
				|| soundexChar == 'x'
				|| soundexChar == 'z'){
			soundexVal = "2";
		} else if (soundexChar == 'd' || soundexChar == 't'){
			soundexVal = "3";
		} else if (soundexChar == 'l'){
			soundexVal = "4";
		} else if (soundexChar == 'm' || soundexChar == 'n'){
			soundexVal = "5";
		}else if (soundexChar == 'r'){
			soundexVal = "6";
		}

		return soundexVal;

	}


	private static boolean isVowel (char soundexChar) {
		
		boolean vowel;

		if (soundexChar == 'a'
				|| soundexChar == 'e'
				|| soundexChar == 'i'
				|| soundexChar == 'o'
				|| soundexChar == 'u'
				|| soundexChar == 'y'){
			vowel = true;
		} else {
			vowel = false;
		}

		return vowel;

	}

}
