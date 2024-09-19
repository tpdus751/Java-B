package ac.controler;

import ac.model.Account;
import ac.model.BankApplication;
import ac.view.Ac_view;

public class Controler {
	
	Account ac;
	BankApplication bankApp = new BankApplication();
	Ac_view v = new Ac_view();
	
	public void start() {
		
		boolean isRewind = true;
		
		while(isRewind) {
			String[] menu = {"계좌생성", "계좌목록", "예금", "출금", "종료"};
			v.showMessage("-----------------------------------------");
			v.showMenu();
			v.showMessage("-----------------------------------------");
			int menuNum = v.getChoice(5);
			v.showMessage("------");
			v.showMessage(menu[menuNum - 1]);
			v.showMessage("------");
			
			switch (menuNum) {
				case 1:
					String account_num = v.getAccountNumByKeyboard("계좌번호 : ");
					String owner_name = v.getOwnerNameByKeyboard("계좌주 : ");
					int money = v.getMoneyByKeyboard("초기입금액 : ");
					ac =  new Account(account_num, owner_name, money);
					ac.upSeq();
					int seq = ac.getSeq();
					bankApp.addAccount(ac, seq);
					v.showMessage("결과 : 계좌가 생성되었습니다.");
					break;
				case 2:
					if (ac == null) {
						v.showMessage("계좌가 비어있습니다.");
					} else {
						for (int i = 0; i < ac.getSeq(); i++) {
							ac = bankApp.getAccount(i);
							account_num = ac.getAc_number();
							owner_name = ac.getAc_name();
							money = ac.getMoney();
							v.showMessage(account_num + "   " + owner_name + "    " + money);
						}
					}
					break;
				case 3:
					while(true) {
						boolean isExists = false;
						account_num = v.getAccountNumByKeyboard("계좌번호 : ");
						for (int i = 0; i < ac.getSeq(); i++) {
							ac = bankApp.getAccount(i);
							if (account_num.equals(ac.getAc_number())) {
								isExists = true;
							}
						}
						if (isExists == false) {
							v.showMessage("존재하지 않는 계좌번호 입니다.");
						} else {
							break;
						}
					}
					
					int addMoney = v.getMoneyByKeyboard("예금액 : ");
					
					for (int i = 0; i < ac.getSeq(); i++) {
						ac = bankApp.getAccount(i);
						if (account_num.equals(ac.getAc_number())) {
							ac.setMoney(ac.getMoney() + addMoney);
							break;
						}
					}
					break;
				case 4:
					int past_money = 0;
					while(true) {
						boolean isExists = false;
						account_num = v.getAccountNumByKeyboard("계좌번호 : ");
						for (int i = 0; i < ac.getSeq(); i++) {
							ac = bankApp.getAccount(i);
							if (account_num.equals(ac.getAc_number())) {
								past_money = ac.getMoney();
								isExists = true;
							}
						}
						if (isExists == false) {
							v.showMessage("존재하지 않는 계좌번호 입니다.");
						} else {
							break;
						}
					}
					
					int popMoney = v.popMoneyByKeyboard("출금액 : ", past_money);
					
					if (popMoney == 0) {
						v.showMessage("결과 : 출금에 실패하였습니다.");
					} else {
						for (int i = 0; i < ac.getSeq(); i++) {
							ac = bankApp.getAccount(i);
							if (account_num.equals(ac.getAc_number())) {
								ac.setMoney(ac.getMoney() - popMoney);
								break;
							}
						}
						v.showMessage("결과 : 출금이 성공되었습니다.");
					}
					break;
				case 5:
					isRewind = false;
					break;
			}
		}
		
	}

}
