package org.github.mervyn.designPatterns.factoryMethodWithAbstractClass;

public class ConcreteCreator extends Creator {

	//工厂方法实现，主要用于产品产品
	@Override
	public Product factoryMethod() {
		return new ConcreteProduct();
	}

}
