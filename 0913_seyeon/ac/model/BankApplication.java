package ac.model;

public class BankApplication {
	private Account[] acc_list = new Account[100];
	
	public void addAccount(Account ac, int seq) {
		this.acc_list[seq - 1] = ac;
	}
	
	public Account getAccount(int i) {
		return acc_list[i];
	}
	
}
