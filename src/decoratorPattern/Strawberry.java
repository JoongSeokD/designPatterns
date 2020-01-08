package decoratorPattern;

public class Strawberry extends Decorator{

	IceCream icecream;

	public Strawberry(IceCream icecream) {
		super();
		this.icecream = icecream;
	}

	@Override
	public String getDescription() {
		return icecream.getDescription() + " µþ±â";
	}

	@Override
	public int price() {
		return 500 + icecream.price();
	}

}
