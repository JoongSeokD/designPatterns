package decoratorPattern;

public class IceCreamCone extends IceCream{
	
	public IceCreamCone() {
		this.description = "���̽�ũ��(��)";
	}

	@Override
	public int price() {
		return 1200;
	}
	
}
