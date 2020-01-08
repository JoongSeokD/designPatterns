package facadePattern;

public class Radio {
	private boolean turnedOn = false;
	
	public void turnOn() {
		turnedOn = true;
		System.out.println("Radio¸¦ ÄÔ.");
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("Radio¸¦ ²û.");
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}
}
