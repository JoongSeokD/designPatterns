package observerPattern;

public class MyClassA implements Observer{

	Publisher observable; // ��ϵ� Observable
	private boolean bPlay; // ���࿩��
	
	public MyClassA(Publisher o) {
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
			System.out.println("MyClassA : ������ �����մϴ�.");
		} else {
			System.out.println("MyClassA : ������ �����մϴ�.");
		}
	}

}
