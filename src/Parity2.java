/**
 * 
 * @author Susan George
 * Parity is computed by erasing the lowest set bit 
 * Time complexity = O(k) where k= number of set bits in a word
 */
public class Parity2 {
	
	//Set the last set bit to 0
	private short computeParity(long x) {
		short result=0;
		while(x!=0) {
			result ^= 1;
			x = x & (x-1);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new Parity2().computeParity(678));

	}

}
