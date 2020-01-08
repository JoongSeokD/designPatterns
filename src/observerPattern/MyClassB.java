package observerPattern;

public class MyClassB implements Observer{
	
	Publisher observable; // ��ϵ� Observable
	private boolean bPlay; // ���࿩��
	
	public MyClassB(Publisher o) {
		super();
		this.observable = o;
		observable.addObserver(this);
	}	
	@Override
	public void update(boolean play) {
		this.bPlay = play;
		myActControl();
	}
	
	public void myActControl() {
		if (bPlay) {
			System.out.println("MyClassB : ������ �����մϴ�.");
		} else {
			System.out.println("MyClassB : ������ �����մϴ�.");
		}
	}

}
