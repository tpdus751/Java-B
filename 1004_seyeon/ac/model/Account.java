package ac.model;

public class Account {
	private String ac_number;
	private String ac_name;
	private int money;
	private static int seq = 0;
	
	public Account(String ac_number, String ac_name, int money) {
		this.ac_number = ac_number;
		this.ac_name = ac_name;
		this.money = money;
		setSeq(getSeq());
	}
	
	public String getAc_number() {
		return ac_number;
	}
	public void setAc_number(String ac_number) {
		this.ac_number = ac_number;
	}
	public String getAc_name() {
		return ac_name;
	}
	public void setAc_name(String ac_name) {
		this.ac_name = ac_name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	// method
	public void upSeq() {
		this.seq += 1;
	}
}
