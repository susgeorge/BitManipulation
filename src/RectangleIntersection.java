
public class RectangleIntersection {
	
	public boolean isIntersect(Rectangle R1, Rectangle R2) {
		return (R1.x <= R2.x+R2.width) && (R2.x <= R1.x+R1.width) &&
				(R1.y <= R2.y+R2.height) && (R2.y <= R1.y+R1.height) ;
	}
	
	public Rectangle getIntersectRectangle(Rectangle R1, Rectangle R2) {
		if(!isIntersect(R1, R2)) {
			return new Rectangle(0, 0, -1, -1);
		}else {
			return new Rectangle(Math.max(R1.x, R2.x), Math.max(R1.y, R2.y), 
					Math.min(R1.x+R1.width, R2.x+R2.width)-Math.max(R1.x, R2.x),
					Math.min(R1.y+R1.height, R2.y+R2.height)-Math.max(R1.y, R2.y));
		}
	}
	

	public static void main(String[] args) {
		Rectangle r1= new Rectangle(76, 9, 12, 14);
		Rectangle r2= new Rectangle(20, 1, 62, 60);
		Rectangle result=new RectangleIntersection().getIntersectRectangle(r1, r2);
		System.out.println(result.x+","+result.y+","+result.width+","+result.height);
		
	}

}

class Rectangle{
	
	int x;
	int y;
	int width;
	int height;
	
	public Rectangle(int x,int y,int width,int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
}
