package org.github.mervyn.designPatterns.abstractFactory;

import static org.junit.Assert.*;

import org.junit.Test;
//AbstractFactoryTest�����Client��
public class AbstractFactoryTest {

	@Test
	public void test() {
		//�������󹤳�
		AbstractFactory factory = new ConcreteFactory1();
		//ConcreteFactory1��������productA1��productB1��������һ����Ʒ��Ĳ�Ʒ
		//ConcreteFactory2������productA2��productB2��������һ����Ʒ��Ĳ�Ʒ
		//Ҫ��productA1��productB1��Ʒ�廻��productA2��productB2��Ʒ�壬
		//ֻ�軻����Ĺ����Ϳ�����(��ConcreteProduct1����ConcreteProduct2)��
		AbstractProductA productA =  factory.createProductA();
		AbstractProductB productB = factory.createProductB();
		productA.productAMehthod();
		productB.productBMethod();
	}

}
