package L0927.Member.model;

public interface MemberService {
	boolean regist(Member member);
	boolean remove(String id);
	
	boolean login(String id, String pwd);
	boolean logout(String id);
	
	Member info(String id, String pwd);
}
