package observerPattern;

public class TestPattern {
	public static void main(String[] args) {
		PlayController pager = new PlayController();
		Observer ob1 = new MyClassA(pager);
		Observer ob2 = new MyClassB(pager);
		
		System.out.println("---- 모든 클래스 일시 정지 ----");
		pager.setFlag(false);
		
		System.out.println();
		
		System.out.println("---- 모든 클래스 다시 시작 ----");
		pager.setFlag(true);
		
	}
}
