

/**
 * 
 * @author Susan George
 * Count the number of set bits in a non-negative integer
 * Time-complexity is O(n) where n is number of bits in integer word
 */
public class CountSetBits {
	
	private short countSetBits(int x) {
		short result=0;
		
		//Repeat the loop until x==0
		while(x!=0) {
			
			//Retrieve the LSB and add it to result
			result += (x&1);
			
			//Shift right by 1 
			x >>>= 1;
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new CountSetBits().countSetBits(15));
	}

}
