package org.github.mervyn.designPatterns.abstractFactory;

public class ConcreteFactory2 extends AbstractFactory {
	//����ProductA2��ProductB2��һ����Ʒ��Ĳ�Ʒ
	@Override
	public AbstractProductA createProductA() {
		return new ProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ProductB2();
	}

}
