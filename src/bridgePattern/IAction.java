package bridgePattern;

public class IAction {
	private IRobot robot;

	public IAction(IRobot robot) {
		super();
		this.robot = robot;
	}
	
	void powerOn() {
		robot.powerOn();
	}
	void powerOff() {
		robot.powerOff();
	}
}
