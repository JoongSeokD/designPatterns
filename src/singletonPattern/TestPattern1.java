package singletonPattern;

public class TestPattern1 {
	
	public static void main(String[] args) {
		Database database;		
		
		database = Database.getInstance("ù ��° Database");
		System.out.println("This is the " + database.getName() + "!!!");
		
		database = Database.getInstance("�� ��° Database");
		System.out.println("This is the " + database.getName() + "!!!");
		
	}
}
