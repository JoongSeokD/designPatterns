package decoratorPattern;

public class IceCreamPop extends IceCream{
	
	public IceCreamPop() {
		this.description = "���̽�ũ��(��:����)";
	}

	@Override
	public int price() {
		return 1000;
	}
	
}
