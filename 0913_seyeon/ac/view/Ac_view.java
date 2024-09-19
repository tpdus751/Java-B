package ac.view;

import java.util.Scanner;

public class Ac_view {
	
	Scanner input = new Scanner(System.in);

	public void showMessage(String string) {
		System.out.println(string);
	}

	public void showMenu() {
		System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
	}

	public int getChoice(int length) {
		System.out.print("선택> ");
		
		boolean isTrue = true;
		
		int num = -1;
		
		while(isTrue) {
			try {
				num = input.nextInt();
			} catch (Exception e) {
				System.out.println("숫자가 아닙니다. 다시 입력해주세요.");
				continue;
			}
			if (num <= 0) {
				System.out.println("양의 정수를 입력하세요.");
			} else if (num > length) {
				System.out.println(length + " 이하의 양의 정수를 입력하세요.");
			} else {
				break;
			}
		}
		input.nextLine();
		
		return num;
	}
	

	public String getAccountNumByKeyboard(String string) {
		System.out.print(string);
		String ac_num = input.nextLine();
		System.out.println();
		return ac_num;
	}

	public String getOwnerNameByKeyboard(String string) {
		System.out.print(string);
		String owner_name = input.nextLine();
		System.out.println();
		return owner_name;
		
	}

	public int getMoneyByKeyboard(String string) {
		boolean isTrue = true;
		int money = -1;
		while(isTrue) {
			System.out.print(string);
			
			try {
				money = input.nextInt();	
			} catch (Exception e) {
				showMessage("숫자로 된 금액을 입력하세요.");
				continue;
			}
			if (money < 0) {
				showMessage("0 이상의 숫자를 입력하세요.");
			} else if (money > 1000000) {
				showMessage("최대 1,000,000원 까지 입금 가능합니다.");
			} else {
				break;
			}
		}
		System.out.println();
		return money;
		
		
	}
	
	public int popMoneyByKeyboard(String string, int past_money) {
		boolean isTrue = true;
		int money = 0;
		while(isTrue) {
			
			if (past_money == 0) {
				showMessage("계좌 잔액이 없습니다.");
				break;
			} else {
				System.out.print(string);
				
				try {
					money = input.nextInt();	
				} catch (Exception e) {
					showMessage("숫자로 된 금액을 입력하세요.");
					continue;
				}
				if (money < 0) {
					showMessage("0 보다 큰 숫자를 입력하세요.");
				} else if (money == 0) {
					showMessage("0원은 출금하실 수 없습니다.");
				} else if (money > past_money) {
					showMessage("출금 금액을 초과하였습니다.");
				} else if (money > 1000000) {
					showMessage("최대 1,000,000원 까지 출금 가능합니다.");
				} else {
					break;
				}
			}
			}
			
			
		System.out.println();
		return money;
		
		
	}
	
}
