package strategyPattern;


public class DatabaseUse {
	private Database db;
	
	public void setDb(Database db) {
		this.db = db;
	}

	// ��ɼ���
	public void connect() {
		if (db == null) {
			System.out.println("�����ͺ��̽��� ���� �����ϼ���.");
		} else {
			db.connectDatabase();
		}
	}
	
	public void select() {
		db.selectData();
	}
}
