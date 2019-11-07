package org.structure.decorate.example1;

public class Chilli extends Condiment {

	private Humburger humburger;
	
	public Chilli(Humburger humburger) {
		this.humburger = humburger;
	}

	@Override
	public String getName() {
		return humburger.getName()+"加辣椒";
	}

	@Override
	public double getPrice() {
		return humburger.getPrice()+0.5;
	}

}
