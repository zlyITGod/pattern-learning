package org.behavior.observer;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject{

	private List<Observer> weixinUserlist = new ArrayList<Observer>();
	
	@Override
	public void attach(Observer o) {
		weixinUserlist.add(o);
		
	}

	@Override
	public void detach(Observer o) {
		weixinUserlist.remove(o);
		
	}

	@Override
	public void notify(String message) {
		 for (Observer observer : weixinUserlist) {
	            observer.update(message);
	        }
	}

}
