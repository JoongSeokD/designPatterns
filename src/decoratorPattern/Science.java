package decoratorPattern;

public class Science extends StudentDecorator{

	private Student student;
	
	public Science(Student student) {
		this.student = student;
	}



	@Override
	public String getDescription() {
		return student.getDescription() + " Like Art";
	}
	
	public void draw() {
		System.out.println("draw pictures!");
	}

}
