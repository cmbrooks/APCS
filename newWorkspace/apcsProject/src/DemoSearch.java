/*
 * 
 * This class demonstrated sequential and binary searching algorithms.
 * 
 */
public class DemoSearch {

	/**
	 * Search the array A for the target integer sequentially.  
	 * Returns the first integer i such that A[i] == target, 
	 * or -1 if the target is not found anywhere in the array. 
	 * 
	 * @param a      Array with integers
	 * @param target Integer to search for in the array
	 * @return
	 */
	public static int sequentialSearch(int[] a, int target) {
	
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				// the target is found at this index
				return i;
			}
		}
		
		// the target has not been found in the array
		return -1;
	}
	
	/**
	 * Search the array A for the target integer sequentially.  
	 * Returns the LAST integer i such that A[i] == target, 
	 * or -1 if the target is not found anywhere in the array. 
	 * 
	 * @param a      Array with integers
	 * @param target Integer to search for in the array
	 * @return
	 */
	public static int sequentialSearchLast(int[] a, int target) {
	
		for (int i = a.length - 1; i >=0; i--) {
			if (a[i] == target) {
				// the target is found at this index
				return i;
			}
		}
		
		// the target has not been found in the array
		return -1;
	}		
	
	
	/**
	 * Search the 2-D array A for the target integer sequentially.  
	 * Returns the first integer i such that target is found in the A[i] row. 
	 * or -1 if the target is not found anywhere in the array. 
	 * 
	 * @param a      Array with integers
	 * @param target Integer to search for in the array
	 * @return row index
	 */
	public static int sequentialSearch2D(int[][] a, int target) {
	
		for (int i = 0; i < a.length; i++) {
			int pos = sequentialSearch(a[i], target);
			
			if (pos > -1) {
				// the target is found at this row index
				return i;
			}
		}
		
		// the target has not been found in the array
		return -1;
	}	


	/**
	 * Returns the position of the element equal to target or -1 if target is not in the array.
	 * 
	 * Precondition: array elements must be sorted in ascending order 
	 * 
	 * @param elements
	 * @param target
	 * @return
	 */
	public static int binarySearch(int[] elements, int target) {
		int left = 0;
		int right = elements.length - 1;
		
		while (left <= right) {
			// divide the search into two halves
			int middle = (left + right) / 2;
			
			if (target < elements[middle]) {
				// search in the left half
				right = middle -  1;
			} else if (target > elements[middle]) {
				// search in the right half
				left = middle + 1;
			} else {
				// target found at this index
				return middle;
			}
		}
		
		// target not found in the array
		return -1;
	}


	/**
	 * Returns the position of the element equal to target or -1 if target is not in the array.
	 * 
	 * Precondition: array elements must be sorted in ascending order 
	 * 
	 * @param elements
	 * @param target
	 * @return
	 */
	public static int recursiveBinarySearch(int[] elements, int left, int right, int target) {
		// by default, set target not found in the array
		int targetPos = -1;
		
		if (left <= right) {
			// divide the search into two halves
			int middle = (left + right) / 2;
			
			if (target < elements[middle]) {
				// search in the left half
				targetPos = recursiveBinarySearch(elements, left, middle - 1, target);
			} else if (target > elements[middle]) {
				// search in the right half
				targetPos = recursiveBinarySearch(elements, middle + 1, right, target);
			} else {
				// target found at this index
				targetPos = middle;
			}
		}
		
		return targetPos;
	}	
	
}
