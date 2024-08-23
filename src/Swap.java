import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String a = "";
		String b = "";
		
		int a_i = 0;
		int b_i = 0;
		
		while(true) {
		
			while (true) {
				
					System.out.print("변수 a에 넣을 숫자 입력 : ");
					a = input.next();
					try {
						if (Integer.parseInt(a) > 0) {
							a_i = Integer.parseInt(a);
							break;
						}
					} catch (Exception e) {
						System.out.println("숫자를 입력하세요.");
					}
				
			}
			
			
			while (true) {
				
				System.out.print("변수 b에 넣을 숫자 입력 : ");
				b = input.next();
				try {
					if (Integer.parseInt(b) > 0) {
						b_i = Integer.parseInt(b);
						break;
					}
				} catch (Exception e) {
					System.out.println("숫자를 입력하세요.");
				}
			}
			
			System.out.println("Swapping 결과>");
			System.out.println("변수 a의 값 = " + b_i);
			System.out.println("변수 b의 값 = " + a_i);
			
			boolean is = true;
			
			do {
				System.out.println("-----------------------------");
				System.out.print("다시 하시겠습니까?(yes / no) : ");
				String re = input.next();
				switch (re) {
					case "yes":
						is = false;
						break;
					case "no":
						break;
				}
			} while (is);
			
		
			
		
		}
	}
}
