package bridgePattern;

public class TestPattern {
	public static void main(String[] args) {
		
		IRobot robot = new RobotMode1();
		Cook work = new Cook(robot);
		work.powerOn();
		work.doCook();
		work.powerOff();
		
		System.out.println("----------------------");
		
		
		IRobot robot2 = new RobotMode2();
		Clean work2 = new Clean(robot2);
		work2.powerOn();
		work2.doClean();
		work2.powerOff();
	}
}
