public class my_sqrt {

	public static void main(String[] args) {

		System.out.println("Final Answer: " + squareRoot(15.3));

	}

	public static double squareRoot(double d){
		double approx = 0;
		if(d>=0){

			double x0 = d/2;
			System.out.println("First approximation: " + x0);
			double lastApprox = x0;
			double diff = x0;

			while(diff > .001){
				approx = ((lastApprox+(d/lastApprox))/2);
				diff = lastApprox - approx;
				lastApprox = approx;
				System.out.println("approx: " + approx);
				System.out.println("diff: " + diff);
			}

		}else{
			System.out.println("The number is imaginary. Please try a real number");
		}
		return approx;
	}

}
