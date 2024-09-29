package L0927.Member.model;

public class Member {
	private String name;
	private int age;
	private String id;
	private String pwd;
	private String addr;
	
	public Member(String name, int age, String id, String pwd, String addr) {
		this.name = name;
		this.age = age;
		this.id = id;
		this.pwd = pwd;
		this.addr = addr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	
	
	
}
