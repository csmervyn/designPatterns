package org.github.mervyn.designPatterns.factoryMethod;
/*
 * 产品接口的实现类：具体产品
 * */
public class ConcreteProduct implements IProduct {

	public void productMethod() {
		System.out.println("我是产品的方法");
	}

}
