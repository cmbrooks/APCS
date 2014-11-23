/*Exercise 3.4 2014-09-17
 *Cody Brooks
 */
public class exercise3_4 {

	public static void main(String[] args){
		
		String currDay = "Wednesday";
		int currDate = 17;
		String currMonth = "September";
		int currYear = 2014;
		
		printAmerican(currDay, currDate, currMonth, currYear);
		printEuropean(currDay, currDate, currMonth, currYear);
		
	}

	
	public static void printAmerican(String day, int date, String month, int year){
		System.out.print("American format: ");
		System.out.println(day + ", " + month + " " + date + ", " + year);
	}
	
	
	public static void printEuropean(String day, int date, String month, int year){
		System.out.print("European format: ");
		System.out.println(day + ", " + date + " " + month + ", " + year);
	}
	
}
