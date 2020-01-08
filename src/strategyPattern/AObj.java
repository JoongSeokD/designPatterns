package strategyPattern;

public class AObj {
	
	BInterface bInterface;
	
	public AObj() {
		bInterface = new BImplement();
	}
	
	public void SomeFunc() {
//		System.out.println("AAA");
//		System.out.println("AAA");
		bInterface.funcA();
		bInterface.funcA();
	}
}
