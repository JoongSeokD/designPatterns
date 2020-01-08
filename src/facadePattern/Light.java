package facadePattern;

public class Light {
	private boolean turnedOn = false;
	
	public void turnOn() {
		turnedOn = true;
		System.out.println("Light�� ��.");
	}

	public void turnOff() {
		turnedOn = false;
		System.out.println("Light�� ��.");
	}

	public boolean isTurnedOn() {
		return turnedOn;
	}
}
