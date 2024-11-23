package thread1122h.w;

// echo 클래스 생성
class Echo01 {
	
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
class Echoer01 extends Thread {
	private String msg;
	static Echo01 echo = new Echo01();
	
	public Echoer01(String msg) {
		this.msg = msg;
	}
	
	// run() 메서드
	@Override
	public void run() {
		synchronized(echo) {
			echo.echo(msg);
			echo.notify();
			try {
				echo.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

// 비동기화
public class Programming04NonSync {
	public static void main(String[] args) {
		Echoer01 p1 = new Echoer01("환영");
		Echoer01 p2 = new Echoer01("자바");
		Echoer01 p3 = new Echoer01("야호~~~");
		
		p1.start();
		p2.start();
		p3.start();
	}
}
