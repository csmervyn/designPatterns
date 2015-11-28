package org.github.mervyn.designPatterns.abstractFactory;

import static org.junit.Assert.*;

import org.junit.Test;
//AbstractFactoryTest类就是Client类
public class AbstractFactoryTest {

	@Test
	public void test() {
		//创建抽象工厂
		AbstractFactory factory = new ConcreteFactory1();
		//ConcreteFactory1产生的是productA1和productB1，它俩是一个产品族的产品
		//ConcreteFactory2产生的productA2和productB2，它俩是一个产品族的产品
		//要从productA1和productB1产品族换到productA2和productB2产品族，
		//只需换具体的工厂就可以了(从ConcreteProduct1换到ConcreteProduct2)。
		AbstractProductA productA =  factory.createProductA();
		AbstractProductB productB = factory.createProductB();
		productA.productAMehthod();
		productB.productBMethod();
	}

}
