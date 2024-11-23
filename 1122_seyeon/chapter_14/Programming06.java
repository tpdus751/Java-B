package thread1122h.w;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Proverb06 {
	private String saying;
	static List<String> list = new ArrayList<>();
	
	public Proverb06() {
	}

	public Proverb06(String saying) {
		this.saying = saying;
		StringTokenizer st = new StringTokenizer(this.saying);
		while (st.hasMoreElements()) {
			String token = st.nextToken(" ");
			this.list.add(token);
		}
	}

	public String getSaying() {
		return saying;
	}

	public void setSaying(String saying) {
		this.saying = saying;
	}
}

class TokenThread06 extends Thread {
	private static String saying;
	private Proverb06 prob;
	
	public TokenThread06(String saying, Proverb06 prob) {
		this.saying = saying;
		this.prob = prob;
	}
	
	
	@Override
	public void run() {
		synchronized(prob) {
			for (int i = 0; i < prob.list.size(); i++) {
				System.out.println(Thread.currentThread().getName() + " : "+ prob.list.get(i));
			}
			prob.notify();
			try {
				prob.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Programming06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("속담 입력 : ");
		String saying = input.nextLine();
		Proverb06 prob = new Proverb06(saying);
		
		TokenThread06 t1 = new TokenThread06(saying, prob);
		TokenThread06 t2 = new TokenThread06(saying, prob);
		t1.setName("속담1");
		t2.setName("속담2");
		
		t1.start();
		t2.start();
	}

}
