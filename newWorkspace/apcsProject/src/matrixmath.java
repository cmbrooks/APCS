/*
Cody Brooks
2014-11-12
*/

public class matrixmath {

  public static void main (String[] args){
	  /*Setup inputs*/
	  int[][] A = {
			  {2,5,7},
			  {7,3,9},
			  {7,2,8}
	  };
	  int[][] B = {
			  {3,6,9},
			  {2,2,8},
			  {1,6,7}
	  };
	  int p = 7;

	  int[][] resultArray = MatMath.mult(A, p);

	  /*Print the result array*/
	  System.out.println("Result Array:");
	  for (int i = 0; i < resultArray.length; i++) {
		  for (int j = 0; j < resultArray[0].length; j++) {
			  System.out.print("\t" + resultArray[i][j]);
		  }
		  System.out.println();
	  }

  }

}

class MatMath {

	/*Scalar Addition*/
	static int [][] add (int p, int[][] A){
	    int[][] result = new int[A.length][A[0].length];
		if (checkMat(A)){
		    for (int i = 0; i < A.length; i++) {
		      for (int j = 0; j < A[i].length; j++) {
		        result[i][j] = p + A[i][j];
		      }
		    }
		} else {
			System.out.println("The input A is not a valid matrix");
			//Throw an exception
		}

    return result;
	}

  /*Scalar Addition*/
  static int [][] add (int[][] A, int p){
    int[][] result = new int[A.length][A[0].length];
	if (checkMat(A)){
	    for (int i = 0; i < A.length; i++) {
	      for (int j = 0; j < A[i].length; j++) {
	        result[i][j] = p + A[i][j];
	      }
	    }
	} else {
		System.out.println("The input A is not a valid matrix");
		//Throw an exception
	}

	return result;
  }

  /*Scalar Multiplication*/
  static int [][] mult (int p, int[][] A){
    int[][] result = new int[A.length][A[0].length];
	if (checkMat(A)){
	    for (int i = 0; i < A.length; i++) {
	      for (int j = 0; j < A[i].length; j++) {
	        result[i][j] = p * A[i][j];
	      }
	    }
	} else {
		System.out.println("The input A is not a valid matrix");
		//Throw an exception
	}

	return result;
  }

  /*Scalar Multiplication*/
  static int [][] mult (int[][] A, int p){
	if (checkMat(A)){
	    int[][] result = new int[A.length][A[0].length];
	    for (int i = 0; i < A.length; i++) {
	      for (int j = 0; j < A[i].length; j++) {
	        result[i][j] = p * A[i][j];
	      }
	    }
	    return result;
	} else {
		System.out.println("The input A is not a valid matrix");
		//Throw an exception
	}

	return null;
  }

  /*Matrix Addition*/
  static int [][] add (int[][] A, int[][] B){
	  int[][] result = new int[ A[0].length ][ B.length ];
	  if (sameSize(A,B)){
	    for (int i = 0; i < A.length; i++) {
	        for (int j = 0; j < A[i].length; j++) {
	          result[i][j] = A[i][j] + B[i][j];
	        }
	    }
	  } else {
		System.out.println("A and B cannot be added together");
		//Throw exception
	  }

	  return result;
  }

  /*Matrix Multiplication*/
  static int [][] mult (int[][] A, int[][] B){
      int[][] result = new int[ A[0].length ][ B.length ];
	  if ( checkMat(A) && checkMat(B) && canMult(A, B) ) {
    	int multSum = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
            	for (int k = 0; k < A[0].length; k++) {
                multSum += ( A[i][k] * B[k][j] );
              }
              result[i][j] = multSum;
              multSum = 0;
            }
          }
      } else {
        System.out.println("A and B cannot be multiplied");
      }
	return result;
  }

  /*Ensures that the given matrix has a valid size*/
  static boolean checkMat (int [][] A) {

	  boolean result = false;

	  for (int i = 0; i < A.length; i++) {
		  if (A[i].length == A[0].length) {
			  /*Matrix is valid*/
			  result = true;
		  } else {
			  /*Matrix is invalid*/
			  result = false;
			  break;
		  }
	  }

	  if (result) {
		  System.out.println("Matrix is valid");
	  } else {
		  System.out.println("Matrix is invalid");
	  }

	  return result;
  }

  /*Checks to see if two matrices are the same dimensions*/
  static boolean sameSize (int[][] A, int[][] B) {
	  boolean result = false;
	  if (checkMat(A) && checkMat(B)) {
		  if (A.length == B.length && A[0].length == B[0].length) {
			  result = true;
		  }
	  } else {
		  result = false;
	  }
	  return result;
  }

  /*Checks to see if two matrices are able to be multiplied*/
  static boolean canMult (int[][] A, int[][] B) {
	  boolean result = false;
	  if (checkMat(A) && checkMat(B) && A[0].length == B.length) {
		  result = true;
	  } else {
		  result = false;
	  }
	  return result;
  }

}
