
public class BitDivision {
	
	private int divide(int x,int y) {
		
		int quotient=0;
		int power=32;
		long ypower= y<< power;
		int remainder=0;
		while(x>=y) {
			while(ypower>x) {
				ypower >>>=1;
				power--;
			}
			
			quotient += (1<<power);
			x -= ypower;
		}
		remainder=x;
		System.out.println("Reminder is :"+ remainder);
		return quotient;
	}

	public static void main(String[] args) {
		System.out.println(new BitDivision().divide(11, 3));

	}

}
