package org.behavior.template_method;

public class ConcreteClass1 extends AbstractPerson {

	@Override
	protected void takeThings() {
		System.out.println("美国对象打架");

	}

	@Override
	protected void eatBreakfast() {
		System.out.println("美国队长吃三明治");

	}

	@Override
	protected void dressUp() {
		System.out.println("美国队长带盾牌");
	}

}
