package org.github.mervyn.designPatterns.factoryMethod;
/*
 * �����ӿڵ�ʵ���ࣺ����Ĺ���
 * */
public class ConcreteCreator implements ICreator {

	//����������ʵ��
	public IProduct  factoryMethod() {
		return new ConcreteProduct();
	}

}
