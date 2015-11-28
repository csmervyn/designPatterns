package org.github.mervyn.designPatterns.factoryMethod;
/*
 * 工厂接口的实现类：具体的工厂
 * */
public class ConcreteCreator implements ICreator {

	//工厂方法的实现
	public IProduct  factoryMethod() {
		return new ConcreteProduct();
	}

}
