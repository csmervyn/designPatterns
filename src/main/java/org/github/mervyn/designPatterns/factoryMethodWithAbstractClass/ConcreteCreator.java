package org.github.mervyn.designPatterns.factoryMethodWithAbstractClass;

public class ConcreteCreator extends Creator {

	//��������ʵ�֣���Ҫ���ڲ�Ʒ��Ʒ
	@Override
	public Product factoryMethod() {
		return new ConcreteProduct();
	}

}
