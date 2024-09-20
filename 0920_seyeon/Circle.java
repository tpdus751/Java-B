package L0920.work;

import java.util.Scanner;

public class Circle {

	static final double PI = 3.14;
	
	protected double radius;
	
	protected double area;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		area = PI * radius * radius;
		return area;
	}
	
	public void setArea() {
		this.area = PI * radius * radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public static double getPi() {
		return PI;
	}
	
	

}
