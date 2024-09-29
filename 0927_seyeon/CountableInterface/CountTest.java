package L0927.CountableInterface;

public class CountTest {

	public static void main(String[] args) {
		Countable[] arr = {new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7)};

		for (Countable c : arr) {
			c.count();
		}
		
		for (Countable c : arr) {
			if (c instanceof Bird) {
				((Bird) c).fly();
			} else {
				((Tree) c).ripen();
			}
		}

	}

}
