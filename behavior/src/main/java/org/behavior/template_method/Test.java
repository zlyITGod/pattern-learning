package org.behavior.template_method;

public class Test {
	public static void main(String[] args) {
		AbstractPerson mGDZ = new ConcreteClass1();
		mGDZ.prepareGotoSchool();
		System.out.println("------");
		AbstractPerson gTX = new ConcreteClass2();
		gTX.prepareGotoSchool();
		
	}
}
