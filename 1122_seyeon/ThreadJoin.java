package thread;

class SumThread extends Thread {
	
	private int sum;
	
	public int getSum() {
		return sum;
	}
	
	@Override
	public void run() {
		synchronized (this) {
			sum = 0;
			for (int i = 1; i <= 100; i++) {
				sum += i;
			}
			notify();
		}
	}
}

public class ThreadJoin {
	
	public static void main(String[] args) {
		SumThread st = new SumThread();
		
		synchronized (st) {
			st.start();
			
			try {
				//st.join();
				st.wait();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("1 ~ 100까지의 합 : " + st.getSum());
	}
}
