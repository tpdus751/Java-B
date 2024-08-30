package friday_work;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean re = true;
		
		while (re) {
		
			System.out.print("숫자를 입력하세요 : ");
			int num = input.nextInt();
			boolean what = oddeven(num);
			
			if (what) {
				System.out.println(">> 짝수입니다.");
			} else {
				System.out.println(">> 홀수입니다.");
			}
			
			System.out.println("계속 하시겠습니까? (0-멈춤/1-계속) : ");
			int num_re = input.nextInt();
			
			if (num_re == 1) {
				re = true;
			} else {
				re = false;
			}
		
		}
		
		

	}
	
	static boolean oddeven(int num) {
		boolean b = (num % 2 == 0) ? true : false;
		
		return b;
	}

}
