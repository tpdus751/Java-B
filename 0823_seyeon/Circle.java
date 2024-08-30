import java.util.Scanner;

public class Circle {
	

	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		while (true) {
		
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


