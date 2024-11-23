package thread1122h.w;

import java.util.Scanner;

public class Programming02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		Thread thread = new Thread(() -> {
			try {
				while(true) {
					System.out.println("작업 실행 중...");
					Thread.sleep(1000);
				}
			} catch (InterruptedException ie) {
				System.out.println("작업 완료");
			}
		});
		
		thread.start();
		
		while(true) {
			System.out.print("입력 : ");
			if (input.nextLine().equals("1")) {
				thread.interrupt(); 
				break;
			}
		}
		
	}

}
