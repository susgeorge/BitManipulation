/**
 * 
 * @author Susan George
 * Time Complexity =O(1)
 *
 */
public class SwapBits {
	
	/*
	 * Extract the bits at index i and j.
	 * If the bits are same,there is no need to swap
	 * If bits are different, then flip the bits which is same as swapping
	 * in the case of binary numbers
	 */
	private long swapBits(long x,int i,int j) {
		
		if( ((x>>>i)&1) != ((x>>>j)&1) ) {
			long bitMask = (1L<<i) | (1L<<j);
			x=x^bitMask;
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(new SwapBits().swapBits(19574056046756L, 15, 14));
	}

}
