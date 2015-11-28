package org.github.mervyn.designPatterns.factoryMethodWithAbstractClass;

import static org.junit.Assert.*;


import org.junit.Test;

public class FactoryMethodWithAbstractClassTest {

	@Test
	public void test() {
		//工厂
		Creator creator = new ConcreteCreator();
		//用工厂方法生产出产品
		Product product =  creator.factoryMethod();
		//调用产品的方法
		product.productMethod();
		
	}

}
