package org.github.mervyn.designPatterns.simpleFactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleFactoryTest {

	@Test
	public void test() {
		//创建静态工厂
		Creator creator = new Creator();
		//调用静态工厂的静态工厂方法，产生产品实例
		Product concreteProduct = creator.createProduct();
		//调用产品实例的方法
		concreteProduct.productMethod();
	}

}
