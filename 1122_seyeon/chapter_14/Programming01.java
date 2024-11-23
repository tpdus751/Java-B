package thread1122h.w;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Programming01 {
	
	public static void main(String[] args) {
		ExecutorService es = Executors.newCachedThreadPool();
		
		Thread t = new Thread(() -> {
			for (int i = 1; i <= 6; i++) {
				System.out.println(i + "초");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			es.shutdown();
		});
		
		es.execute(t);
	}
}
