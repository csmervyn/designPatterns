package org.github.mervyn.designPatterns.simpleFactory;

import static org.junit.Assert.*;

import org.junit.Test;

public class SimpleFactoryTest {

	@Test
	public void test() {
		//������̬����
		Creator creator = new Creator();
		//���þ�̬�����ľ�̬����������������Ʒʵ��
		Product concreteProduct = creator.createProduct();
		//���ò�Ʒʵ���ķ���
		concreteProduct.productMethod();
	}

}
