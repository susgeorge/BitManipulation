/**
 * @author Susan George
 *
 */
public class BitMultiplication {
	
	private long multiply(long x,long y) {
		long sum=0;
		while(y!=0) {
			if((y&1)!=0) {
				sum=add(sum,x);
			}
			y>>>=1;
			x<<=1;
		}
		return sum;
	}
	
	private long add(long a,long b) {
		long tempA=a;
		long tempB=b;
		long k=1;
		long carryIn=0;
		long sum=0;
		while(tempA!=0 || tempB!=0) {
			long ak=a&k;
			long bk=b&k;
			long carryout= (ak&bk) | (ak&carryIn) | (bk&carryIn);
			sum= sum | (ak^bk^carryIn);
			carryIn = carryout<<1;
			k <<=1;
			tempA >>>=1;
			tempB >>>=1;
		}
		
		return sum | carryIn;
	}
	
	
	public static void main(String[] args) {
		System.out.println(new BitMultiplication().multiply(40, 30));
	}

}
