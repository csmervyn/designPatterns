package org.github.mervyn.designPatterns.abstractFactory;

public class ConcreteFactory1 extends AbstractFactory {
	//假设ProductA和ProductB是一个产品族内的产品
	
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
