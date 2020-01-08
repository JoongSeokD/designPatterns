package singletonPattern.case1.step1;

public class Database {
	private static Database singleton = new Database("products");
	
	private String name;

	private Database(String name) {
		try {
			Thread.sleep(100);
			this.name = name;
		} catch (Exception e) {
		}
		
	}

	public  static Database getInstance(String name) {
		return singleton;
	}
	
	public String getName() {
		return name;
	}
	
}
