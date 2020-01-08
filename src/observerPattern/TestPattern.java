package observerPattern;

public class TestPattern {
	public static void main(String[] args) {
		PlayController pager = new PlayController();
		Observer ob1 = new MyClassA(pager);
		Observer ob2 = new MyClassB(pager);
		
		System.out.println("---- ��� Ŭ���� �Ͻ� ���� ----");
		pager.setFlag(false);
		
		System.out.println();
		
		System.out.println("---- ��� Ŭ���� �ٽ� ���� ----");
		pager.setFlag(true);
		
	}
}
