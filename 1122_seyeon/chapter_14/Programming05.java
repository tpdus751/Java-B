package thread1122h.w;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

class Proverb {
	private String saying;
	static List<String> list = new ArrayList<>();
	
	public Proverb() {
	}

	public Proverb(String saying) {
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

class TokenThread extends Thread {
	private static String saying;
	private Proverb prob;
	
	public TokenThread(String saying, Proverb prob) {
		this.saying = saying;
		this.prob = prob;
	}
	
	
	@Override
	public void run() {
		for (int i = 0; i < prob.list.size(); i++) {
			synchronized(prob) {
				System.out.println(Thread.currentThread().getName() + " : "+ prob.list.get(i));
				
				prob.notify();
				try {
					prob.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}

public class Programming05 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("속담 입력 : ");
		String saying = input.nextLine();
		Proverb prob = new Proverb(saying);
		
		TokenThread t1 = new TokenThread(saying, prob);
		TokenThread t2 = new TokenThread(saying, prob);
		t1.setName("속담1");
		t2.setName("속담2");
		
		t1.start();
		t2.start();
	}

}
