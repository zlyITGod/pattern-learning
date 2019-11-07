package org.structure.decorate.example1;

public class Beef extends Condiment{

	private Humburger humburger;
	
	
	public Beef(Humburger humburger) {
		this.humburger = humburger;
	}

	@Override
	public String getName() {
		return humburger.getName()+"加肉";
	}

	@Override
	public double getPrice() {
		return humburger.getPrice()+5;
	}

}
