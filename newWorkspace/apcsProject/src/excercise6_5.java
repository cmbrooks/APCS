public class excercise6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] coord1 = {1,2};
		int[] coord2 = {3,5};
		int[] coord3 = {6,3};
		
		System.out.println("Distance between point 1 and 2 is: " + distance(coord1[0], coord1[1], coord2[0], coord2[1]));
		System.out.println("Distance between point 2 and 3 is: " + distance(coord2[0], coord2[1], coord3[0], coord3[1]));
		System.out.println("Distance between point 1 and 3 is: " + distance(coord1[0], coord1[1], coord3[0], coord3[1]));
		
	}

	
	public static double distance (double x1, double y1, double x2, double y2){
		double diffY;
		double diffX;
		double distance;
		
		diffY = (y2-y1);
		diffX = (x2-x1);
		distance = Math.sqrt(sumSquares (diffX, diffY));
		
		return distance;
	}
	
	
	public static double sumSquares (double x, double y){
		return ((x*x)+(y*y));
	}
	
}
