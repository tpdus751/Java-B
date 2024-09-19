package L0913;

public class Cat {
	String breed;
	String color;
	String feed;
	
	public Cat(String breed, String color, String feed) {
		this.breed = breed;
		this.color = color;
		this.feed = feed;
	}

	public Cat(String breed, String color) {
		this.breed = breed;
		this.color = color;
	}

	public Cat(String breed) {
		this.breed = breed;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFeed() {
		return feed;
	}

	public void setFeed(String feed) {
		this.feed = feed;
	}
	
	public void eat(String time) {
		System.out.println(time + "에 사료를 먹습니다.");
	}
	
	public void meow() {
		System.out.println("야옹~~~~");
	}
	
	public void scratch() {
		System.out.println("스크래치를 긁습니다.");
	}
	
	public void introduce() {
		System.out.println("나의 고양이는 " + color + " " + breed + "입니다.");
	}
	
}


