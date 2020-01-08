package facadePattern;

public class Computer {
	private boolean turnedOn = false;
	
	public void turnOn() {
		turnedOn = true;
		System.out.println("Computer�� ��.");
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("Computer�� ��.");
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}
}
