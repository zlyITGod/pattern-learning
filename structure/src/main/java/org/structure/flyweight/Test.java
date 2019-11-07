package org.structure.flyweight;

public class Test {
	FlyweightFactory factory = new FlyweightFactory();
	
	Flyweight fly1;
	Flyweight fly2;
	Flyweight fly3;
	Flyweight fly4;
	Flyweight fly5;
	Flyweight fly6;
	public Test() {
		fly1 = factory.getFlyWeight("DDD");
		fly2 = factory.getFlyWeight("aaa");
		fly3 = factory.getFlyWeight("DDD");
		fly4 = factory.getFlyWeight("DDD");
		fly5 = factory.getFlyWeight("DDD");
		fly6 = factory.getFlyWeight("DDD");
	}
	
	public void showFlyweight() {
		fly1.operation();
		fly2.operation();
		fly3.operation();
		fly4.operation();
		fly5.operation();
		fly6.operation();
		int size = factory.getFlyweightSize();
		System.out.println("objSiza = " + size);
	}


	public static void main(String[] args) {
		System.out.println("---享元模式---");
		Test test = new Test();
		test.showFlyweight();
	}
}
