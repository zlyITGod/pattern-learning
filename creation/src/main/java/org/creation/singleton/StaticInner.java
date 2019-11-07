package org.creation.singleton;

public class StaticInner {

	private StaticInner() {}
	
	private static class LazyHolder {
		private static final StaticInner INSTANCE = new StaticInner();
	}
	
	public static final StaticInner getInstance() {
		return LazyHolder.INSTANCE;
	}
	
}
