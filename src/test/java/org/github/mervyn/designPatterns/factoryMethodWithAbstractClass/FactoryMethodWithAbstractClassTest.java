package org.github.mervyn.designPatterns.factoryMethodWithAbstractClass;

import static org.junit.Assert.*;


import org.junit.Test;

public class FactoryMethodWithAbstractClassTest {

	@Test
	public void test() {
		//����
		Creator creator = new ConcreteCreator();
		//�ù���������������Ʒ
		Product product =  creator.factoryMethod();
		//���ò�Ʒ�ķ���
		product.productMethod();
		
	}

}
