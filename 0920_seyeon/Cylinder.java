package L0920.work;

public class Cylinder extends Circle {
	
	private double height;

	public Cylinder(double radius, double height) {
		super(radius);
		this.height = height;
	}

	public double getHeight() {
		return height;
	}

	@Override
	public double getArea() {
		area = (2 * PI * radius * radius) + 2 * PI * radius * height;
		return area;
	}
	
	
	
	
	
	

}
