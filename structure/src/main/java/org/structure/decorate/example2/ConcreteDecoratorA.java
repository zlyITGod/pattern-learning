package org.structure.decorate.example2;

public class ConcreteDecoratorA extends Decorator {

	private String addedState = "New State A";
	
	@Override
	public void Operation() {
		super.Operation();
		System.out.println(addedState);
	}
	
	
}
