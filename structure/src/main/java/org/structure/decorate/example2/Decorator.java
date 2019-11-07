package org.structure.decorate.example2;

public abstract class Decorator extends Component {

	protected Component componet;
	
	
	
	public void SetComponent(Component componet) {
		this.componet = componet;
	}


	@Override
	public void Operation() {
		if (componet != null) {
			componet.Operation();
		}

	}

}
