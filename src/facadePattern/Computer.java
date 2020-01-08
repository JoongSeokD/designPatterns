package facadePattern;

public class Computer {
	private boolean turnedOn = false;
	
	public void turnOn() {
		turnedOn = true;
		System.out.println("Computer¸¦ ÄÔ.");
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("Computer¸¦ ²û.");
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}
}
