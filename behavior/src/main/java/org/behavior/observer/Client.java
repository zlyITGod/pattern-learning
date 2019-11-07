package org.behavior.observer;

public class Client {
	public static void main(String[] args) {
		SubscriptionSubject m=new SubscriptionSubject();
	    //创建微信用户
		ConcreteSubject user1=new ConcreteSubject("杨影枫");
		ConcreteSubject user2=new ConcreteSubject("月眉儿");
		ConcreteSubject user3=new ConcreteSubject("紫轩");
	    //订阅公众号
		m.attach(user1);
		m.attach(user2);
		m.attach(user3);
	    //公众号更新发出消息给订阅的微信用户
		m.notify("更新了");
	}
	
   

}
