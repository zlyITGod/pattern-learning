package org.structure.flyweight;


public class ConcreteFlyweight extends Flyweight {

	private String string;
	
	
	public ConcreteFlyweight(String string) {
		this.string = string;
	}



	@Override
	public void operation() {
		System.out.println("Concrete---Flyweight : " + string);
	}

}
