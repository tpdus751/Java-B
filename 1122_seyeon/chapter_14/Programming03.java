package thread1122h.w;

import java.util.Random;

class NumAndSum {
	static private int sum = 0;
	static private int i = 0;
	
	public static int getSum() {
		return sum;
	}
	
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	public static int getI() {
		return i;
	}
	
	public static void setI(int i) {
		NumAndSum.i = i;
	}
	
	
}

class Accumulator extends Thread {
	private int cnt;
	private int sum;
	private int num;
	private int i;
	Random r = new Random();
	static NumAndSum ns = new NumAndSum();

	public Accumulator(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public void run() {
		synchronized(ns) {
			while(NumAndSum.getI() < cnt) {
				num = r.nextInt(10);
				sum = num + ns.getSum();
				ns.setSum(sum);
				ns.setI(NumAndSum.getI() + 1);
				System.out.println(Thread.currentThread().getName() + " : " + ns.getSum());
				try {
					Thread.sleep(1000);
					ns.notify();
					if (NumAndSum.getI() < cnt) {
						ns.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class Programming03 {
	
	public static void main(String[] args) {
		Accumulator ac1 = new Accumulator(5);
		Accumulator ac2 = new Accumulator(5);
		ac1.setName("Thread-01");
		ac2.setName("Thread-02");
		ac1.start();
		ac2.start();
		
		try {
			ac1.join();
			ac2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("누적 값 : " + NumAndSum.getSum());
	}

}
