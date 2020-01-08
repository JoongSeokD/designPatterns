package strategyPattern;

public class TestPattern2 {
	public static void main(String[] args) {
		
		// �����ͺ��̽��� ���������� �����Ͽ� ����Ѵ�.
		DatabaseUse myDB = new DatabaseUse();
		myDB.connect();
		
		// A(DatabaseUse)���� ���� ���� �������� ������ B(MySQL)�� �Ѵ�.
		myDB.setDb(new MySQL());
		myDB.connect();
		myDB.select();

		// A(DatabaseUse)���� ���� ���� �������� ������ B(Informix)�� �Ѵ�.
		myDB.setDb(new Informix());
		myDB.connect();
		myDB.select();
		
		// [�߰� ��û ����]
		// Oracle Ŭ���� �߰��� ���� �ڵ� �߰�������
		// �����ڵ��� ���� ���� ����Ŭ ���� ����� �߰��� �� �ִ�.
		myDB.setDb(new Oracle());
		myDB.connect();
		myDB.select();
		
	}
}
