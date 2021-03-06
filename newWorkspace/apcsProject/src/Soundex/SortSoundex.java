package Soundex;

/*
Cody Brooks
2014-11-10
*/

import java.util.Arrays;

public class SortSoundex {

	public static void main (String[] args) {

		/*
		Step 1:
		Create an array of president names from USPresidentNames.java
		*/
		String[] nameList = USPresidentNames.getLastNames();

		/*
		Step 2:
		Create an array of Soundex values of each president name
		*/
		String[] soundexList = new String[nameList.length];

		for (int i = 0; i < nameList.length; i++) {
			soundexList[i] = SoundexComparableS.getSoundex(nameList[i]);
		}

		/*
		Step 3:
		Use built in Java Arrays.sort() function to sort soundexes
		*/
		Arrays.sort(soundexList);

		/*
		Step 4:
		Print sorted array
		*/
		for (int i = 0; i < soundexList.length; i++) {
			System.out.println(soundexList[i]);
		}

	}

}


class SoundexComparableS extends AmericanSoundexS implements Comparable<SoundexComparableS> {
	String name;
	String soundex;

	public int compareTo(SoundexComparableS otherSoundex) {
		return this.soundex.compareTo(otherSoundex.getSoundex());
	}

	public void setSoundex (String x) {
		this.name = x;
		this.soundex = AmericanSoundexS.getSoundex(x);
	}

	public String getSoundex () {
		return soundex;
	}

	public void printSoundex (String x) {
		System.out.println(getSoundex(x));
	}

}

class AmericanSoundexS {

	public static String getSoundex( String name ) {

		String soundex = "";

		name = name.toLowerCase();
		char[] nameCharList = name.toCharArray();

		/*Flags all vowels*/
		boolean[] vowelLs = new boolean[name.length()];
		for (int i = 0; i < nameCharList.length; i++) {
			vowelLs[i] = isVowel(nameCharList[i]);
		}

		/*Adds soundex values for all letters*/
		for (int i = 0; i < nameCharList.length; i++){
			String code = getSoundexVal(nameCharList[i]);
			if (code.length() == 0 && i == 0) {
					soundex += nameCharList[0];
			} else {
				if (soundex.length() > 0
						&& soundex.substring(soundex.length() - 1, soundex.length()).equals(code)) {
					if (vowelLs[i-1]){
						soundex += code;
					}
				} else {
					soundex += code;
				}
			}
		}

		/*Replaces the first value with the first letter*/
		soundex = nameCharList[0] + soundex.substring(1, soundex.length());

		/*Replace the first character in the string with the first letter of the word*/
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


class USPresidentNames {

	/** All U.S. Presidents. */
	private static String[] lastNames = {
		"Washington",
		"Adams",
		"Jefferson",
		"Madison",
		"Monroe",
		"Adams",
		"Jackson",
		"Buren",
		"Harrison",
		"Tyler",
		"Polk",
		"Fillmore",
		"Pierce",
		"Buchanan",
		"Lincoln",
		"Johnson",
		"Grant",
		"Hayes",
		"Garfield",
		"Arthur",
		"Cleveland",
		"Harrison",
		"Cleveland",
		"McKinley",
		"Roosevelt",
		"Taft",
		"Wilson",
		"Harding",
		"Coolidge",
		"Hoover",
		"Roosevelt",
		"Truman",
		"Eisenhower",
		"Kennedy",
		"Johnson",
		"Nixon",
		"Ford",
		"Carter",
		"Reagan",
		"Bush",
		"Clinton",
		"Bush",
		"Obama"
	};

	/** Get a copy of the last names. */
	public static String[] getLastNames() {

		// The clone() method is inherited from the super class java.lang.Object
		// It makes a copy of the lastNames
		return lastNames.clone();
	}
}
