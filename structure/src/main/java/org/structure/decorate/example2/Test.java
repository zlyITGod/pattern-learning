package org.structure.decorate.example2;

public class Test {
	public static void main(String[] args) {
		ConcreteComponent c = new ConcreteComponent(); 
		ConcreteDecoratorA a = new ConcreteDecoratorA();
		ConcreteDecoratorB b = new ConcreteDecoratorB();
		a.SetComponent(c);
		b.SetComponent(a);
		b.Operation();
		
		
		
		
	}
}
