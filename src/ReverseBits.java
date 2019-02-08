/**
 * 
 * @author Susan George
 * Time complexity =O(n/L) where n=word size and L is the size of keys to index the look-up table
 * Time complexity does not include the time taken to compute the look-up table
 */
public class ReverseBits {
	
	static long[] preComputedReverse;
	
	static {
		preComputedReverse=new long[1<<16];
		for(int i=0;i<(1<<16);++i) {
			preComputedReverse[i]=reverseBits(i,15);
		}
	}
	
	static long reverseBits(long number,int n) {
		for(int i=0,j=n;i<j;++i,--j) {
			number=swapBits(number,i,j);
		}
		return number;
	}
	
	static long swapBits(long number,int i,int j) {
		if( ((number >>> i)&1) != ((number >>> j)&1) ) {
			long bitMask= (1L<<i) | (1L<<j);
			number= number^ bitMask;
		}
		return number;
	}
	
	private long reverse(long x) {
		final int BIT_MASK= 0xFFFF;
		final int MASK_SIZE=16;
		return preComputedReverse[(int)(x & BIT_MASK)] << (3*MASK_SIZE) |
			   preComputedReverse[(int)((x >>> MASK_SIZE)&BIT_MASK)] << (2*MASK_SIZE) |
			   preComputedReverse[(int)((x >>> (2* MASK_SIZE))&BIT_MASK)] << MASK_SIZE |
			   preComputedReverse[(int)((x >>> (3* MASK_SIZE))&BIT_MASK)] ;
	}
	
	private long reverse2(long x) {
		for (int i=0,j=63;i<j;i++,--j) {
			x=swapBits(x, i, j);
		}
		return x;
	}

	public static void main(String[] args) {
		System.out.println(new ReverseBits().reverse(-5));
		System.out.println(new ReverseBits().reverse2(-5));
		
		short x=-5;
		StringBuilder b=new StringBuilder();
		for(int i =0;i<16;i++) {
			b.append(x&1);
			x >>>=1;
		}
		System.out.println(b.reverse().toString());
	}

}
