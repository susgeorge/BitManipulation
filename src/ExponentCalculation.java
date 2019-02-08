
public class ExponentCalculation {
	
	private double exponent(double x, int y) {
		double result=1.0;
		int power=y;
		
		if(y<0) {
			x=1.0/x;
			power=-power;
		}
		
		while(power!=0) {
			if((power&1) !=0 ) {
				result *=x;
			}
			x *=x;
			power >>>=1;
		}
		
		return result;
	}

	public static void main(String[] args) {
		System.out.println(new ExponentCalculation().exponent(3.2, 7));

	}

}
