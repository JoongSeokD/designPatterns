package decoratorPattern;

public class IceCreamCake extends IceCream{
	
	public IceCreamCake() {
		this.description = "���̽�ũ��(����ũ)";
	}

	@Override
	public int price() {
		return 1500;
	}
	
}