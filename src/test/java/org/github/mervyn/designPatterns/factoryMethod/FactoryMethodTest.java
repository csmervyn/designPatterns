package org.github.mervyn.designPatterns.factoryMethod;

import static org.junit.Assert.*;


import org.junit.Test;

public class FactoryMethodTest {

	@Test
	public void test() {
		//����
		ICreator creator = new ConcreteCreator();
		//���ù����Ĺ���������������Ʒ����
		IProduct product = creator.factoryMethod();
		//���ö���ķ���
		product.productMethod();
	}
	

	

}
