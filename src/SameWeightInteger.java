/**
 * 
 * @author Susan George
 *
 */
public class SameWeightInteger {
	
	//Time complexity = O(n) where n is word size
	private long sameWeight(long x) {
		int NO_UNSIGNED_BITS=63;
		for(int i=0;i<NO_UNSIGNED_BITS-1;i++) {
			if( ((x>>>i)&1) != ((x>>>(i+1))&1) ) {
				long bitMask = (1L<<i) | (1L<<(i+1));
				x=x^bitMask;
				break;
			}
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(new SameWeightInteger().sameWeight(626143));
	}

}
