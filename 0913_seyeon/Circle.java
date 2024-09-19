package L0913;

import java.util.Scanner;

public class Circle {

	static final double PI = 3.14;
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public void getArea() {
		double area = PI * radius * radius;
		System.out.println("반지름이 " + radius + "인 원의 넓이는 " + area + "입니다.");
	}
	

}
