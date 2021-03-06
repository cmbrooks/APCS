/*Exercise 2.3 2014-09-15
 *Cody Brooks
 */
public class Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Initialization of Variables*/
		
		/*Current Time: 10:40:35*/
		int currHour = 10;
		int currMinute = 40;
		int currSecond = 35;
		
		int secondsPassed;
		int totalSeconds;
		int secondsLeft;
		int dayPercent;
		
		/*Processing*/
		secondsPassed = (currHour*3600 + currMinute*60 + currSecond);
		totalSeconds = (24*3600);
		secondsLeft = (totalSeconds - secondsPassed);
		dayPercent = ((secondsPassed*100)/(totalSeconds));
		
		/*Output*/
		System.out.print("Seconds since Midnight: ");
		System.out.println(secondsPassed);
		System.out.print("Seconds left today: ");
		System.out.println(secondsLeft);
		System.out.print("Percentage of the day that has passed: ");
		System.out.println(dayPercent);
	}

}
