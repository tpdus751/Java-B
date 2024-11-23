package thread1122h.w;

public class Try02 {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
			// for문을 사용해 1초마다 0부터 하나씩 증가해서 5초 동안 출력
			for (int i = 0; i < 5; i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		
		int alphabet = 'a';	
		t.start();
		
		// 작업 스레드가 살아 있을 동안 메인 스레드의 작업 수행
		while(t.isAlive()) {
			System.out.println((char)alphabet);
			alphabet += 1;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
