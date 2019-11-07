package org.behavior.template_method;

public class ConcreteClass2 extends AbstractPerson {

	@Override
	protected void takeThings() {
		System.out.println("钢铁侠飞行");

	}

	@Override
	protected void eatBreakfast() {
		System.out.println("钢铁侠吃汉堡");

	}

	@Override
	protected void dressUp() {
		System.out.println("钢铁侠变身");
	}

}
