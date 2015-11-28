package org.github.mervyn.designPatterns.abstractFactory;

public class ConcreteFactory1 extends AbstractFactory {
	//����ProductA��ProductB��һ����Ʒ���ڵĲ�Ʒ
	
	@Override
	public AbstractProductA createProductA() {
		return new ProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB1();
	}

}
