package org.creation.singleton;

public class Singleton {

	private Singleton() {}
	
	private volatile static Singleton singleton = null;
	
	public static synchronized Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	
	
		
}

class Singleton2 {

	private Singleton2() {}
	
	private static Singleton2 singleton2 = new Singleton2();
	
	public static synchronized Singleton2 getInstance() {
		return singleton2;
	}

	
	
		
}
