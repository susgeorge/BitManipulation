import java.util.Random;
/**
 * 
 * @author Susan George
 * Time complexity is O(log(ub-lb+1))
 *
 */
public class GenerateUniformRandom {
	
	private int uniformRandom(int lb,int ub) {
		int noOfOutcomes=ub-lb+1;
		int result=0;
		do {
			result=0;
			for(int i=0;(1<<i)<noOfOutcomes;i++) {
				result=(result<<1) | genZeroOneRandom();
			}
		}while(result>=noOfOutcomes);
		return result+lb;
	}
	
	private int genZeroOneRandom() {
		Random random=new Random();
		 return random.nextInt(2);
	}

	public static void main(String[] args) {
		System.out.println(new GenerateUniformRandom().uniformRandom(4, 10));
	}

}
