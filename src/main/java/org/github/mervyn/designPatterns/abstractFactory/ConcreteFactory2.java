package org.github.mervyn.designPatterns.abstractFactory;

public class ConcreteFactory2 extends AbstractFactory {
	//假设ProductA2和ProductB2是一个产品族的产品
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
