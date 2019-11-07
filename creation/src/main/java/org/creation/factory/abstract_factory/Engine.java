package org.creation.factory.abstract_factory;


public abstract class Engine {

}

class EngineA extends Engine{
	public EngineA() {
		System.out.println("制造-->发动机型号A");
	}
}
class EngineB extends Engine{
	public EngineB() {
		System.out.println("制造-->发动机型号B");
	}
}

abstract class AirConditon {
	
}
class AirConditonA extends AirConditon {
	public AirConditonA() {
		System.out.println("制造-->空调型号A");
	}	
}
class AirConditonB extends AirConditon {
	public AirConditonB() {
		System.out.println("制造-->空调型号B");
	}	
}
interface AbstarctFactory {
	public Engine createEngine();
	public AirConditon createAirCondition();
}
class FactoryBMW320 implements AbstarctFactory {

	@Override
	public Engine createEngine() {
		return new EngineA();
	}

	@Override
	public AirConditon createAirCondition() {
		return new AirConditonB();
	}
	
}
class FactoryBMW525 implements AbstarctFactory {

	@Override
	public Engine createEngine() {
		return new EngineB();
	}

	@Override
	public AirConditon createAirCondition() {
		return new AirConditonA();
	}
	
}
class Customer {
	public static void main(String[] args) {
		AbstarctFactory BMW320 = new FactoryBMW320();
		BMW320.createEngine();BMW320.createAirCondition();
		
		AbstarctFactory BMW525 = new FactoryBMW525();
		BMW525.createEngine();BMW525.createAirCondition();
	}
}


