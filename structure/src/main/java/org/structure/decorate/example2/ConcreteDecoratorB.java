package org.structure.decorate.example2;

public class ConcreteDecoratorB extends Decorator {
	
	@Override
	public void Operation() {
		super.Operation();
		addedBehavior();
	}
	
	private void addedBehavior() {
		System.out.println("我是B独有的");
	}
	
}
