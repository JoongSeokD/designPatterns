package strategyPattern;

public class Informix extends Database{
	
	public Informix() {
		name = "Informix";
		rows = 40;
	}
	
	@Override
	public void connectDatabase() {
		System.out.println(name + " �� �����߽��ϴ�.");
	}

}
