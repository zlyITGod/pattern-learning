package org.creation.factory.simple_factory;

public abstract class BMW {

	public BMW() {
	}
	
}

class BMW320 extends BMW {

	public BMW320() {
		System.out.println("制造-->宝马320");
	}
	
}

class BMW525 extends BMW {

	public BMW525() {
		System.out.println("制造-->宝马525");
	}
	
}

class Factory {
	public BMW create(int type) {
		switch (type) {
		case 320:
			return new BMW320();
		case 525:
			return new BMW525();
		default:
			break;
		}
		return null;
	}
}

class Customer {
	public static void main(String[] args) {
		Factory factory = new Factory();
		factory.create(320);
		factory.create(525);
	}
}