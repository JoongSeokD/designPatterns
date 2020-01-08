package facadePattern;

public class TestPattern {
	public static void main(String[] args) {
		
		Computer computer = new Computer();
		Light light = new Light();
		Radio radio = new Radio();
		
		// ���� ��� ���
		// ������ ���� �� ����
		computer.turnOff();
		light.turnOff();
		radio.turnOff();
		
		
		// �Ļ�� ���� ���� �� ��� ���
		// ���� ���� �� ����
		HomeFacade home = new HomeFacade(computer, light, radio);
		home.homeIn();
	}
}
