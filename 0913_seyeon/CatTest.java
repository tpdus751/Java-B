package L0913;

public class CatTest {
	public static void main(String[] args) {
		Cat cat1 = new Cat("코숏", "노랑");
		
		cat1.introduce();
		cat1.eat("아침");
		cat1.meow();
		System.out.println();
		cat1.eat("점심");
		cat1.scratch();
		cat1.meow();
	}
}
