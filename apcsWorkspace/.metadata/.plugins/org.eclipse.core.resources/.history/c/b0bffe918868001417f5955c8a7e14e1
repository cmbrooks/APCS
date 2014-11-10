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
			soundexList[i] = CompareSoundex.getSoundex(nameList[i]);
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