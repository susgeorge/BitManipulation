/**
 * 
 * @author Susan George
 * Time complexity =O(logn) where n=word size
 */
public class Parity4 {
	
	private short computeParity(long x) {
		x= x & x>>>32;
		x= x & x>>>16;
		x= x & x>>>8;
		x= x & x>>>4;
		x= x & x>>>2;
		x= x & x>>>1;
		return (short) (x&1);
	}

	public static void main(String[] args) {
		System.out.println(new Parity4().computeParity(5794530425053671L));
	}
}
