/* Exercise 2.2. 2014-09-15
 * Cody Brooks
 */

public class Date {

	public static void main(String[] args) {
		//Initializing Variables (Housekeeping/Input)
		String day = "Monday";
		String month = "September";
		int date = 15;
		int year = 2014;
		
		//Output
		System.out.println("American Format:");
		System.out.println(day + ", " + month + " " + date + ", " + year);
		System.out.println("European Format:");
		System.out.println(day + " " + date + " " + month + ", " + year);
	}

}
