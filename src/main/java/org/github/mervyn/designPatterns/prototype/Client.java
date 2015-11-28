package org.github.mervyn.designPatterns.prototype;

public class Client {
	public void clientMethod(){
		ConcretePrototype concretePrototype = new ConcretePrototype();
		for(int i = 0;i < 5;i++){
			ConcretePrototype clonedCP = (ConcretePrototype) concretePrototype.clone();
			clonedCP.concretePrototypeMethod();
		}
	}
}
