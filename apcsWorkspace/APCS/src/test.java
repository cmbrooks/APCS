
public class test {

	public static void main(String[] args) {
		int[] testArray = {1,2,3,4,5,6,7,8,9,10};
		int i = 2;
		
		for(int j = i; j <= testArray.length - 1; j++){
			testArray[j-1] = testArray[j];
		}
		
		//Print all elements in numberList
		for(int k = 0; i <= testArray.length - 1; k++){
			System.out.println(testArray[i]);
		}

	}

}
