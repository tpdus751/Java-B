import java.util.Scanner;

public class IsBool {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		while (true) {
		
			String scan = "";
			double scan_d = 0;
			
			while (true) {
				
					System.out.print("정수를 입력하세요 : ");
					scan = input.next();
					try {
						if (Double.parseDouble(scan) >= 0 || Double.parseDouble(scan) < 0) {
							scan_d = Double.parseDouble(scan);
							break;
						}
					} catch (Exception e) {
						System.out.println("숫자를 입력하세요.");
					}
				
			}
			
			String isWhat;
			
			if ((int)scan_d % 2 == 0) {
				isWhat = "짝수";
			} else {
				isWhat = "홀수";
			}
			
			System.out.println(isWhat);
			
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
