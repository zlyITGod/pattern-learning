package org.behavior.strategy;

public class Test {
	public static void main(String[] args) {
		Context context;
		
		System.out.println("开始使用第一步");
		context = new Context(new ConcreteStrategy1());
		context.operate();
		System.out.println("开始使用第二步");
		context.setStrategy(new ConcreteStrategy2());
		context.operate();
		System.out.println("开始使用第三步");
		context.setStrategy(new ConcreteStrategy3());
		context.operate();
		
		/*开始使用第一步
		我是策略第一步喔  plan A
		开始使用第二步
		我是策略第二步喔  plan B
		开始使用第三步
		我是策略第三步喔  plan C*/
		
		
	}
}
