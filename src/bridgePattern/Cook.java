package bridgePattern;

public class Cook extends IAction{

	public Cook(IRobot robot) {
		super(robot);
	}
	
	public void doCook() {
		System.out.println("�丮�� �մϴ�.");
	}
}
