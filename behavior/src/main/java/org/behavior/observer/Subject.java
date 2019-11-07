package org.behavior.observer;


public interface Subject {
	public void attach(Observer o);
	
	public void detach(Observer o);
	
	public void notify(String message);
}
	
