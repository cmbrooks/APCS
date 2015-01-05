import java.lang.Math;
public class monteCarlo{
    public static void main (String[] args) {
    	int size = 100000;
		double[] xcoord = new double[size];
		double[] ycoord = new double [size];
		
		int inside = 0;
		
		/*Generate Coords*/
		for (int i = 0; i < size; i++) {
			xcoord[i] = Math.random();
			ycoord[i] = Math.random();
		}
		
		for (int i = 0; i < size; i++) {
			if ( ( Math.pow(xcoord[i], 2) + Math.pow(ycoord[i], 2) ) <= 1 ) {
				inside++;
			}
		}
		
		System.out.println("Number of points inside the circle: " + inside);
		System.out.println("Total points: " + size);
		
		/*FIX INTERGER DIVISION*/
		double fraction = ((double)inside / (double)size);
		System.out.println("Estimation of Pi: " + fraction * 4);
		
    }
}
