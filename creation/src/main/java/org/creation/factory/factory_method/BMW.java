package org.creation.factory.factory_method;

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

interface FactortBMW {
	BMW create();
}

class Factory320 implements FactortBMW {
	@Override
	public BMW create() {
		return new BMW320();
	}
}

class Factory525 implements FactortBMW {
	@Override
	public BMW create() {
		return new BMW525();
	}
	
}

class Customer {
	public static void main(String[] args) {
		FactortBMW factortBMW320 = new Factory320();
		factortBMW320.create();
		FactortBMW factortBMW525 = new Factory525();
		factortBMW525.create();
	}
}