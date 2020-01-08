package facadePattern;

public class Light {
	private boolean turnedOn = false;
	
	public void turnOn() {
		turnedOn = true;
		System.out.println("Light¸¦ ÄÔ.");
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("Light¸¦ ²û.");
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}
}
