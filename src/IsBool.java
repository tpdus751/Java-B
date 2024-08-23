import java.util.Scanner;

public class IsBool {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String scan = "";
		double scan_d = 0;
		
		while (true) {
			
				System.out.print("정수를 입력하세요 : ");
				scan = input.next();
				try {
					if (Double.parseDouble(scan) > 0) {
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

	

	}

}
