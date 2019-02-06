

/**
 * @author Susan George
 * Compute the parity of a 64-bit word using XOR
 * Time-complexity = O(n) where n is word size
 */
public class Parity1 {
	
	static short computeParity(long x) {
		short result=0;
		
		//Uses XOR which implements the function 'MOD 2'
		while(x!=0) {
			result ^= (x&1);
			x >>>=1;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(computeParity(678));
	}

}
