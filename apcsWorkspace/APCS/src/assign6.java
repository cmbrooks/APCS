public class assign6 {

	public static void main(String[] args) {
		
		String container = "Rubermaid";
		PODS pod3 = new PODS();
		
		System.out.println("Twice the length  of the string: " + pod3.storage(container));
		
		
		int colorIndex = 3;
		String newHue = "005C00";
		rainbow DoubleRainbow = new rainbow();
		
		System.out.println("Current HTML Value: " + DoubleRainbow.returnHue(colorIndex));
		DoubleRainbow.updateHue(colorIndex, newHue);
		System.out.println("New HTML Value: " + DoubleRainbow.returnHue(colorIndex));

	}

}


public class rainbow{
	
	int rainbowColorCount = 7;
	String[] colorList = {"red", "orange", "yellow", "green", "blue", "indigo", "violet"};
	static String[] colorHuesHTML = {"FF000", "FF6600", "FFFF00", "009900", "0000FF", "6600FF", "660066"};
	int colorIndex;
	String newHue;
	
	public static void updateHue(int colorIndex, String newHue){
		colorHuesHTML[colorIndex] = newHue;
	}
	
	public static String returnHue(int colorIndex){
		return colorHuesHTML[colorIndex];
	}
	
}


public class PODS{
	
	int storage(String s) {
		  return s.length() * 2;
	}
	
}
