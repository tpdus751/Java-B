package L0927.Soundable;

public class SoundableExample {
	public static void printSound(Soundable animal) {
		System.out.println(animal.sound());
	}
	
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}
}
