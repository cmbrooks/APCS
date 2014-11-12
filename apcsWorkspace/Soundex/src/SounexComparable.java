/*
 Cody Brooks
 2014-11-11
 */

public class SoundexComparable extends AmericanSoundex implements Comparable<SoundexComparable> {
  String name;
  String soundex;

  public int compareTo(SoundexComparable otherSoundex) {		
    return this.soundex.compareTo(otherSoundex.getSoundex());
  }

  public void setSoundex (String x) {
    this.name = x;
    this.soundex = AmericanSoundex.getSoundex(x);
  }

  public String getSoundex () {
    return soundex;
  }

  public void printSoundex (String x) {
    System.out.println(getSoundex(x));
  }

}
