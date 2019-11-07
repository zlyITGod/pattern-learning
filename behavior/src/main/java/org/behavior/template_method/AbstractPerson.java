package org.behavior.template_method;

public abstract class AbstractPerson {
	//抽象类定义整个流程骨架
	public void prepareGotoSchool() {
		dressUp();
		eatBreakfast();
		takeThings();
	}

	protected abstract void takeThings();

	protected abstract void eatBreakfast();

	protected abstract void dressUp();
}
