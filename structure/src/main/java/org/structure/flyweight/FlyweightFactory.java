package org.structure.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {
	//private Hashtable<Object,Flyweight> flyweights = new Hashtable<>();
	private Hashtable<Object,Flyweight> flyweights2 = new Hashtable<>();
	public FlyweightFactory() {

	}

	public Flyweight getFlyWeight(Object obj) {
		Flyweight flyweight = (Flyweight)flyweights2.get(obj);
		if (flyweight == null) {
			//产生新的ConcreteFlyweight
			flyweight = new ConcreteFlyweight((String)obj);
			flyweights2.put(obj, flyweight);
		}
		return flyweight;
	}
	
	public int getFlyweightSize() {
		return flyweights2.size();
	}
	
}
