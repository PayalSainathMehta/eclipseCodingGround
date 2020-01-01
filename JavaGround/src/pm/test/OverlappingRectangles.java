package pm.test;

public class OverlappingRectangles {
	public static void main(String[] args) {
		Point l1 = new Point(0,10);
		Point r1 = new Point(10,0);
		Point l2 = new Point(5,5);
		Point r2 = new Point(15,0);
		
		Rectangle first = new Rectangle(l1,r1);
		Rectangle second = new Rectangle(l2,r2);

		if(first.isOverlapping(second))
			System.out.println("Overlapping");
		else
			System.out.println("Not overlapping");
	}
	
	
	
}


class Point{
	int x, y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	
}

class Rectangle{
	private final Point topLeft;
	private final Point bottomRight;
	
	public Rectangle(Point topLeft, Point bottomRight) {
		this.topLeft = topLeft;
		this.bottomRight = bottomRight;
	}
	

	public boolean isOverlapping(Rectangle second) {
		if(this.topLeft.x > second.bottomRight.x  //rect1 right of rect2
				|| this.bottomRight.x < second.topLeft.x //
				|| this.topLeft.y < second.bottomRight.y 
				|| this.bottomRight.y > second.topLeft.y)
		return false;
		return true;
	}

}	
