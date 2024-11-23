package thread1122h.w;

class Worker extends Thread {
	
	@Override
	public void run() {
		// for문을 사용해 1초마다 0부터 하나씩 증가해서 5초 동안 출력
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Try01 {
	
	public static void main(String[] args) {
		int alphabet = 'a';	
		
		// 작업 스레드 객체 생성 및 시작
		Worker w = new Worker();
		w.start();
		
		// 작업 스레드가 살아 있을 동안 메인 스레드의 작업 수행
		while(w.isAlive()) {
			System.out.println((char)alphabet);
			alphabet += 1;
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
