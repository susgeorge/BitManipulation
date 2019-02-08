/**
 * 
 * @author Susan George
 * Time Complexity = O(n) , Space complexity = O(1) where n = number of digits in input
 *
 */
public class DecimalIntegerPalindrome {
	
	private boolean isIntegerPalindrom(int x) {
		
		if(x<0) {
			return false;
		}
		
		int noOfDigits=(int)(Math.floor(Math.log10(x)))+1;
		int msbMask=(int)Math.pow(10, noOfDigits-1);
		
		for(int i=0;i<(noOfDigits/2);i++) {
			if(x/msbMask != x % 10) {
				return false;
			}
			x= x % msbMask;
			x=x/10;
			msbMask=msbMask/100;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new DecimalIntegerPalindrome().isIntegerPalindrom(5225));
		System.out.println(new DecimalIntegerPalindrome().isIntegerPalindrom(121));
		System.out.println(new DecimalIntegerPalindrome().isIntegerPalindrom(527));
	}

}
