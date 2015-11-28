package org.github.mervyn.designPatterns.simpleFactory;

public class ConcreteProduct extends Product {

	@Override
	public void productMethod() {
		System.out.println("我ConcreteProduct（具体工厂）的productMethod方法");
	}

}
