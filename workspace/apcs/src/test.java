public class test{//Declare the array
	public static void main(String[] args){
		
		boolean numbers [] = new boolean[100];
		int y = 0;
		
		//Declare all numbers as true to begin
		for(int i = 2; i < 100;i++){
		    numbers[i] = true;
		}
		//Run loop that increases i and multiplies it by increasing multiples
		for (int x = 2; x < 100; x++) {
		
		    //A loop for the increasing multiples; keep those numbers below 100
		    //Set any multiple of "x" to false
		    for(int n = 2; y < 100; n++){
			    y = n * x;
			    if(y<100){
			    	numbers[y] = false;
			    }
		    }
		}
		
		//Print all elements in array
		System.out.println("");
		System.out.println("Final Array:");
		for(int i = 0; i <= numbers.length-1; i++){
			System.out.println(i + ": " + numbers[i]);
		}
	}
}