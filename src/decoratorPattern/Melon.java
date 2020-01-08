package decoratorPattern;

public class Melon extends Decorator{

	IceCream icecream;

	public Melon(IceCream icecream) {
		super();
		this.icecream = icecream;
	}

	@Override
	public String getDescription() {
		return icecream.getDescription() + " ¸á·Ð";
	}

	@Override
	public int price() {
		return 300 + icecream.price();
	}

}
