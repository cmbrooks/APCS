/*Exercise 5.2 2014-10-28
 *Cody Brooks
 */

class StatCalc {

    private int count;   // Number of numbers that have been entered.
    private double sum;  // The sum of all the items that have been entered.
    private double squareSum;  // The sum of the squares of all the items.

    public void enter(double num) {
        count++;
        sum += num;
        squareSum += num*num;
    }

    public int getCount() {
        return count;
    }

    public double getSum() {
        return sum;
    }

    public double getMean() {
        return sum / count;
    }

    public double getStandardDeviation() {
        double mean = getMean();
        return Math.sqrt( squareSum/count - mean*mean );
    }

}

class MyStatCalc extends StatCalc{

	private double max = 0.0;
	private double min = 0.0;

    public void enter(double num) {
        super.enter(num);
        /*If it is the first time a number has been entered,
        that number is both the minumum and the maximum*/
        if(this.getCount() == 1){
          max = num;
          min = num;
        }else{
          /*If the number entered is greater than the previous
          max, it is the new max*/
          if(num >= max){
          	max = num;
          /*If the number entered is less than the previous
          min, it is the new min*/
          }else if(num <= min){
          	min = num;
          }
        }
    }

    /*Returns the maximum number that has been entered to the dataset*/
    public double getMax(){
    	return max;
    }

    /*Returns the minamum number that has been entered to the dataset*/
    public double getMin(){
    	return min;
    }

}

public class testCalc{

	public static void main(String[] args){
    /*Creates a new instance of MyStatCalc*/
		MyStatCalc calc = new MyStatCalc();

    /*Enters some numbers and tests getMin() and getMax() methods*/
		calc.enter(2.6);
		calc.enter(5.3);
		calc.enter(52.0);
		calc.enter(-1.3);
		System.out.println("Max is: " + calc.getMax());
		System.out.println("Min is: " + calc.getMin());

	}
}
