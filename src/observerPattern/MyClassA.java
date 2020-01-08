package observerPattern;

public class MyClassA implements Observer{

	Publisher observable; // 등록될 Observable
	private boolean bPlay; // 실행여부
	
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
			System.out.println("MyClassA : 동작을 시작합니다.");
		} else {
			System.out.println("MyClassA : 동작을 정지합니다.");
		}
	}

}
