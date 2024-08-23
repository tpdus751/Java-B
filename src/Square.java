import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String garo = "";
		String sero = "";
		
		double garo_d = 0;
		double sero_d = 0;
		
		while (true) {
			
				System.out.print("직사각형의 가로 길이 : ");
				garo = input.next();
				try {
					if (Double.parseDouble(garo) > 0) {
						garo_d = Double.parseDouble(garo);
						break;
					}
				} catch (Exception e) {
					System.out.println("숫자를 입력하세요.");
				}
			
		}
		
		
		while (true) {
			
			System.out.print("직사각형의 세로 길이 : ");
			sero = input.next();
			try {
				if (Double.parseDouble(sero) > 0) {
					sero_d = Double.parseDouble(sero);
					break;
				}
			} catch (Exception e) {
				System.out.println("숫자를 입력하세요.");
			}
		
	}
		
		System.out.println("직사각형의 넓이는 " + garo_d * sero_d + "입니다");

	}

}
