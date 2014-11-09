public class CompareSoundex extends AmericanSoundex implements Comparable<CompareSoundex> {
	String name;
	String soundex;
	
	public int compareTo(CompareSoundex otherSoundex) {		
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