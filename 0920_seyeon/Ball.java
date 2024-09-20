package L0920.work;

public class Ball extends Circle {

	public Ball(double radius) {
		super(radius);
		
	}

	@Override
	public double getArea() {
		area = 4 * PI * radius * radius; 
		
		return area;
	}
	
	

}
