package strategyPattern;


public class DatabaseUse {
	private Database db;
	
	public void setDb(Database db) {
		this.db = db;
	}

	// 기능선택
	public void connect() {
		if (db == null) {
			System.out.println("데이터베이스를 먼저 선택하세요.");
		} else {
			db.connectDatabase();
		}
	}
	
	public void select() {
		db.selectData();
	}
}
