package decoratorPattern;

public class IceCreamPop extends IceCream{
	
	public IceCreamPop() {
		this.description = "아이스크림(바:막대)";
	}

	@Override
	public int price() {
		return 1000;
	}
	
}
