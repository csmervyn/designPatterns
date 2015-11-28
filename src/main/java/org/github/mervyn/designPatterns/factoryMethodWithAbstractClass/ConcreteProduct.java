package org.github.mervyn.designPatterns.factoryMethodWithAbstractClass;

public class ConcreteProduct extends Product {

	//产品类业务方法实现
	@Override
	public void productMethod() {
		System.out.println("我是产品方法");
	}

}
