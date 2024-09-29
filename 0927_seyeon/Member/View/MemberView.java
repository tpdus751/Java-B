package L0927.Member.View;

import java.util.Scanner;

import L0927.Member.model.Member;

public class MemberView {
	
	Scanner input;
	StringBuilder sb;

	public int showMenuNotLogin() {
		String[] menus = {"회원 등록", "로그인", "종료"};
		
		while (true) {
			sb = new StringBuilder();
			for (int i = 1; i <= menus.length; i++) {
				sb.append(i + ". " + menus[i - 1] + "\n");
			}
			sb.append("\n선택하세요 : ");
			
			System.out.print(sb.toString());
			
			int menuNum = inputValidKey(menus);
			
			if (menuNum <= -1 || menuNum > menus.length) {
				continue;
			} else {
				return menuNum;
			}
		}
	}

	private int inputValidKey(String[] menus) {
		sb = new StringBuilder();
		sb.append("유효하지 않은 숫자입니다.");
		int key = -1;
		input = new Scanner(System.in);
		try {
			key = input.nextInt();
			if (key < 0 || key > menus.length) {
				System.out.println(sb.toString());
			} else {
				return key;
			}
		} catch (Exception e) {
			System.out.println(sb.toString());
		}
		
		return key;
	}

	public String[] showRegistForm() {
		String[] registForm = {"이름을 입력하세요", "나이를 입력하세요", "등록할 id를 입력하세요", "pwd를 입력하세요", "주소를 입력하세요"};
		String[] memberInfo = new String[5];
		input.nextLine();
		for (int i = 0; i < registForm.length; i++) {
			System.out.print(">> " + registForm[i] + " : ");
			memberInfo[i] = input.nextLine();
		}
		return memberInfo;
	}

	public boolean showDeleteMemberForm() {
		input.nextLine();
		boolean isDelete;
		while(true) {
			System.out.print("정말 탈퇴 하시겠습니까? (yes / no) : ");
			String answer = input.nextLine();
			if (answer.equals("yes")) {
				isDelete = true;
				break;
			} else if (answer.equals("no")) {
				isDelete = false;
				break;
			} else {
				System.out.println("yes / no 중에 정확히 입력하세요.");
				continue;
			}
		}
		if (isDelete) {
			return true;
		} else {
			return false;
		}
		

	}

	public String[] showLoginForm() {
		input.nextLine();
		System.out.println("-------------로그인--------------");
		System.out.print("id : ");
		String id = input.nextLine();
		System.out.print("pwd : ");
		String pwd = input.nextLine();
		String[] idPwd = {id, pwd};
		return idPwd;
	}

	public void showMessage(String string) {
		System.out.println(string);
		
	}

	public int showMenuLogined() {
		String[] menus = {"회원 탈퇴", "로그아웃", "회원정보 조회", "종료"};
		
		while (true) {
			sb = new StringBuilder();
			for (int i = 1; i <= menus.length; i++) {
				sb.append(i + ". " + menus[i - 1] + "\n");
			}
			sb.append("\n선택하세요 : ");
			
			System.out.print(sb.toString());
			
			int menuNum = inputValidKey(menus);
			
			if (menuNum <= -1 || menuNum > menus.length) {
				continue;
			} else {
				return menuNum;
			}
		}
	}

	public String[] showInfoForm() {
		input.nextLine();
		System.out.println("회원 정보를 조회하기 위해 id, pwd를 입력하세요.");
		System.out.print("id : ");
		String id = input.nextLine();
		System.out.print("pwd : ");
		String pwd = input.nextLine();
		String[] idPwd = {id, pwd};
		return idPwd;
	}
	
}
