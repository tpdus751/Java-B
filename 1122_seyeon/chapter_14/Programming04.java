package thread1122h.w;

// echo 클래스 생성
class Echo {
	
	public void echo(String msg) {
		// 3번 반복 echo 메서드
		for (int i = 0; i < 3; i++) {
			System.out.println(msg);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// Echoer 클래스 작성
class Echoer extends Thread {
	private String msg;
	Echo echo = new Echo();
	
	public Echoer(String msg) {
		this.msg = msg;
	}
	
	// run() 메서드
	@Override
	public void run() {
		echo.echo(msg);
	}
}

// 비동기화
public class Programming04 {
	public static void main(String[] args) {
		Echoer p1 = new Echoer("환영");
		Echoer p2 = new Echoer("야호~~~");
		Echoer p3 = new Echoer("자바");
		
		p1.start();
		p2.start();
		p3.start();
	}
}
