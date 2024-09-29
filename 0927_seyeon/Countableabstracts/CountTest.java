package L0927.Countableabstracts;

public class CountTest {

	public static void main(String[] args) {
		Countable_A[] arr = {new Bird("뻐꾸기", 5), new Bird("독수리", 2), new Tree("사과나무", 10), new Tree("밤나무", 7)};

		for (Countable_A c : arr) {
			c.count();
		}
		
		for (Countable_A c : arr) {
			if (c instanceof Bird) {
				((Bird) c).fly();
			} else {
				((Tree) c).ripen();
			}
		}

	}

}
