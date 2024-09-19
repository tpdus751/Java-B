package L0913;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("원의 반지름 : ");
		double radius = input.nextDouble();
		Circle c = new Circle(radius);
		
		c.getArea();

	}

}
