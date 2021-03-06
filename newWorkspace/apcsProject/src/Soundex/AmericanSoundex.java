package Soundex;

/*
Cody Brooks
2014-11-11
*/

public class AmericanSoundex {

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
