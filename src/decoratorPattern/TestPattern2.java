package decoratorPattern;

public class TestPattern2 {
	public static void main(String[] args) {
		Student g1 = new AmericanStudent();
		System.out.println(g1.getDescription());

		Student g2 = new Science(g1);
		System.out.println(g2.getDescription());
		
		Student g3 = new Art(g2);
		System.out.println(g3.getDescription());
	}
}
