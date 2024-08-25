import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while(true) {
		
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
			
			boolean is = true;
			
			String what = "";
			
			do {
				System.out.println("-----------------------------");
				System.out.print("다시 하시겠습니까?(yes / no) : ");
				String re = input.next();
				switch (re) {
					case "yes":
						is = false;
						what = "yes";
						break;
					case "no":
						is = false;
						what = "no";
						break;
					default :
						System.out.println("yes / no 둘 중에 한 개를 정확히 입력하세요.");
				}
			} while (is);
			
			if (what.equals("yes")) {
				continue;
			} else {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		
		}

	}

}
