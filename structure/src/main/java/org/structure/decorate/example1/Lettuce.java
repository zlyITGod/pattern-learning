package org.structure.decorate.example1;

//生菜(装饰者第一层)
public class Lettuce extends Condiment {

	private Humburger humburger;
	
	public Lettuce(Humburger humburger) {
		this.humburger=humburger;
	}

	@Override
	public String getName() {
		return humburger.getName()+"加生菜";
	}

	@Override
	public double getPrice() {
		return humburger.getPrice()+1.5;
	}

}
