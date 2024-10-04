package ac.model;

import java.util.HashMap;

public class BankApplication {
	private HashMap<String, Account> accList = new HashMap<>();

	public HashMap<String, Account> getAccList() {
		return accList;
	}

	public void addAccount(String account_num, Account ac, int seq) {
		accList.put(account_num, ac);
		
	}
	
	public Account getAccount(String account_num) {
		return accList.get(account_num);
	}
	
	
	
}
