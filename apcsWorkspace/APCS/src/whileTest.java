
public class whileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		int x = 0;
		
		while (i < 2){
			System.out.println("The loop is post-iterative");
			x = 1;
		}
		
		if(x == 1){
			System.out.println("Dad was rigtht");
		}else{
			System.out.println("Loop was pre-iterative");
			System.out.println("I think I was right");
		}
	}

}
