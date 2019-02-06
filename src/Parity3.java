/**
 * 
 * @author Susan George
 * Compute parity by processing multiple bits at a time and caching
 * Time complexity = O(n/L) where n is word size and L is the size of key used to index lookup table
 */
public class Parity3 {
	
	static short[] preComputedParity;
	
	static {
		preComputedParity=new short[1<<16];
		for(int i=0;i<(1<<16);++i) {
			preComputedParity[i]=Parity1.computeParity(i);
		}
	}
	
	static short computeParity(long x) {
		final int MASK_SIZE=16;
		final int BIT_MASK=0xFFFF;
		
		return (short) (preComputedParity[(int) (x >>> (3*MASK_SIZE)) & BIT_MASK ] ^
						preComputedParity[(int) (x >>> (2*MASK_SIZE)) & BIT_MASK ] ^
						preComputedParity[(int) (x >>> (MASK_SIZE)) & BIT_MASK ] ^
						preComputedParity[(int) (x & BIT_MASK) ]) ;
	}

	public static void main(String[] args) {
		System.out.println(computeParity(5794530425053671L));

	}

}
