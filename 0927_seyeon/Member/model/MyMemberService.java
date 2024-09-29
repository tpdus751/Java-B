package L0927.Member.model;

import java.util.HashMap;

public class MyMemberService implements MemberService {

	HashMap<String, Member> memberList = new HashMap<>();
	Member m = null;
	
	@Override
	public boolean regist(Member member) {
		memberList.put(member.getId(), member);
		
		return true;
	}

	@Override
	public boolean remove(String id) {
		memberList.remove(id);
		
		return true;
		
	}

	@Override
	public boolean login(String id, String pwd) {
		if (memberList.containsKey(id)) {
			return true;
		} else {
			return false;
		}
		
	}

	@Override
	public boolean logout(String id) {
		return true;
		
	}

	@Override
	public Member info(String id, String pwd) {
		m = memberList.get(id);
		if (id.equals(m.getId()) && pwd.equals(m.getPwd())) {
			return m;
		} else {
			m = null;
			return m;
		}
	}
	
}
