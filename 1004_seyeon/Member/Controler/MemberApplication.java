package L0927.Member.Controler;

import java.util.HashMap;

import L0927.Member.model.Member;
import L0927.Member.model.MemberService;
import L0927.Member.model.MyMemberService;
import L0927.Member.view.MemberView;

public class MemberApplication {
	Member m;
	MemberService ms = new MyMemberService();
	MemberView v = new MemberView();

	public void start() {
		
		boolean isLogin = false;
		
		String loginId = null;
		
		boolean isRewind = true;
		
		while(isRewind) {
		
			if (!isLogin) {
				int menuNum = v.showMenuNotLogin();
				
				switch(menuNum) {
					// 회원가입
					case 1:
						String[] memberInfo = v.showRegistForm();
						String name = (memberInfo[0]);
						int age = Integer.parseInt(memberInfo[1]);
						String id = memberInfo[2];
						String pwd = memberInfo[3];
						String addr = memberInfo[4];
						m = new Member(name, age, id, pwd, addr);
						boolean isTrue = ms.regist(m);
						v.showMessage("성공적으로 등록되었습니다.");
						break;
						
					// 로그인
					case 2:
						String[] idPwd = v.showLoginForm();
						String idForLogin = idPwd[0];
						String pwdForLogin = idPwd[1];
						boolean canLogin = ms.login(idForLogin, pwdForLogin);
						if (canLogin) {
							loginId = idForLogin;
							isLogin = true;
							v.showMessage("로그인에 성공하였습니다.");
						} else {
							v.showMessage("로그인에 실패하였습니다.");
						}
						break;
						
					// 종료
					case 3:
						isRewind = false;
						break;
					
						
				}
			} else {
				int menuNum = v.showMenuLogined();
				
				switch(menuNum) {
					// 회원탈퇴
					case 1:
						boolean isDelete = v.showDeleteMemberForm();
						if (isDelete) {
							ms.remove(loginId);
							v.showMessage("성공정으로 회원정보가 삭제되었습니다.");
							isLogin = false;
						} else {
							v.showMessage("회원정보 삭제를 취소합니다.");
						}
						
						break;
						
					// 로그아웃
					case 2:
						ms.logout(loginId);
						v.showMessage("로그아웃 되었습니다.");
						isLogin = false;
						break;
					
					// 회원정보 조회
					case 3:
						String[] idPwd = v.showInfoForm();
						m = ms.info(idPwd[0], idPwd[1]);
						if (m == null) {
							v.showMessage("잘못된 id거나 pwd 입니다.");
						} else {
							v.showMessage("회원정보 조회");
							v.showMessage("이름 : " + m.getName());
							v.showMessage("나이 : " + m.getAge());
							v.showMessage("아이디 : " + m.getId());
							v.showMessage("주소 : " + m.getAddr());
						}
						break;
						
					// 종료
					case 4:
						isRewind = false;
						break;
					}	
			}
		
		}
	}
	
}
