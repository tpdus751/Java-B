package L0927.DB;

public class OracleDao implements DataAccessObject {
	
	private String name = "Oracle";
	private String db = "DB";

	@Override
	public void select() {
		System.out.println(name + " " + db + "에서 검색");
	}

	@Override
	public void insert() {
		System.out.println(name + " " + db + "에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println(name + " " + db + "에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println(name + " " + db + "에서 삭제");
		
	}
	
}
