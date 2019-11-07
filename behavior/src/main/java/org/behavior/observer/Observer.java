package org.behavior.observer;

public interface Observer {
	public void update(String message) ;
}

class ConcreteSubject implements Observer {
	private String name;

	public ConcreteSubject(String name) {
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println(name+"---"+message);
		
	}
	
	
}