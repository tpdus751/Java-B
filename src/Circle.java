import java.util.Scanner;

public class Circle {
	

	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		String r = "";
		double r_d = 0;
		
		while (true) {
			
				System.out.print("원의 반지름을 입력하세요(cm) : ");
				r = input.next();
				try {
					if (Double.parseDouble(r) > 0) {
						r_d = Double.parseDouble(r);
						break;
					}
				} catch (Exception e) {
					System.out.println("숫자를 입력하세요.");
				}
			
		}
		

		
		System.out.print("원의 넓이는 ");
		System.out.printf("%.2f", PI * r_d * r_d);
		System.out.println("입니다.");

	}

}


