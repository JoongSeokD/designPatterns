package decoratorPattern;

public class Art extends StudentDecorator{

	private Student student;
	
	public Art(Student student) {
		this.student = student;
	}



	@Override
	public String getDescription() {
		return student.getDescription() + " Like Science";
	}
	
	public void caltulateStuff() {
		System.out.println("scientific calculation!");
	}

}
