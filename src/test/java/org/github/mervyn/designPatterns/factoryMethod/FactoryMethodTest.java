package org.github.mervyn.designPatterns.factoryMethod;

import static org.junit.Assert.*;


import org.junit.Test;

public class FactoryMethodTest {

	@Test
	public void test() {
		//工厂
		ICreator creator = new ConcreteCreator();
		//调用工厂的工厂方法，产生产品对象
		IProduct product = creator.factoryMethod();
		//调用对象的方法
		product.productMethod();
	}
	

	

}
