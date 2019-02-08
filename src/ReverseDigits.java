
/**
 * @author Susan George
 * Time complexity = O(n) where n = number of digits in input
 */
public class ReverseDigits {

	private long reverseDigits(int x) {
		int result=0;
		int temp=Math.abs(x);
		while(temp!=0) {
			result=result *10 + temp % 10;
			temp=temp/10;
		}
		return (x<0)? -result: result;
	}
	public static void main(String[] args) {
		System.out.println(new ReverseDigits().reverseDigits(-234));
		System.out.println(new ReverseDigits().reverseDigits(789));
	}

}
