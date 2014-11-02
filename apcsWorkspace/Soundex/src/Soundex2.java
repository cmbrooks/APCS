
public class Soundex2 {

	public static void main(String[] args) {
		
		String name = "Tymczak";
		String soundex = "";
		char[] nameList = name.toCharArray();
		char firstLetter = nameList[0];
		
		/*Replace letters with their soundex value*/
		for (int i = 0; i < nameList.length; i++){
			if (nameList[i] == 'a'
					|| nameList[i] == 'e'
					|| nameList[i] == 'i'
					|| nameList[i] == 'o'
					|| nameList[i] == 'u'
					|| nameList[i] == 'y'
					|| nameList[i] == 'h'
					|| nameList[i] == 'w'){
//				System.out.println("Skip the letter " + soundexChar + " at index " + i);	
				nameList[i] = ' ';
			} else if (nameList[i] == 'b'
					|| nameList[i] == 'f'
					|| nameList[i] == 'p'
					|| nameList[i] == 'v'){
				nameList[i] = '1';
//				System.out.println("Because index " + i + " is " + soundexChar + ", the number 1 was added to soundexList");
			} else if (nameList[i] == 'c'
					|| nameList[i] == 'g'
					|| nameList[i] == 'j'
					|| nameList[i] == 'k'
					|| nameList[i] == 'q'
					|| nameList[i] == 's'
					|| nameList[i] == 'x'
					|| nameList[i] == 'z'){
				nameList[i] = '2';
//				System.out.println("Because index " + i + " is " + soundexChar + ", the number 2 was added to soundexList");
			} else if (nameList[i] == 'd' || nameList[i] == 't'){
				nameList[i] = '3';
//				System.out.println("Because index " + i + " is " + soundexChar + ", the number 3 was added to soundexList");
			} else if (nameList[i] == 'l'){
				nameList[i] = '4';
//				System.out.println("Because index " + i + " is " + soundexChar + ", the number 4 was added to soundexList");
			} else if (nameList[i] == 'm' || nameList[i] == 'n'){
				nameList[i] = '5';
//				System.out.println("Because index " + i + " is " + soundexChar + ", the number 5 was added to soundexList");
			}else if (nameList[i] == 'r'){
				nameList[i] = '6';
//				System.out.println("Because index " + i + " is " + soundexChar + ", the number 6 was added to soundexList");
			}

		}
		
		/*Starts soundex off with first letter*/
		soundex += firstLetter;
		
		/*Remove duplicates*/
		for (int i = 1; i < nameList.length; i++){
			if (nameList[i] != nameList[i-1] && nameList[i] != ' '){
				soundex += nameList[i];
			} else if (nameList[i-1] == ' ' && nameList[i] == nameList[i-2]){
				/*Do nothing*/
			}
		}
		
		/*Fill or truncate soundex*/
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
		
		/*Final details*/
		System.out.println("The final soundex is " + soundex);
		
	}

}
