package org.github.mervyn.designPatterns.templateMethod;

public class ConcreteClass extends AbstractClass {
	//��������ʵ��
	@Override
	protected void abstractMethod() {
		// ���ҵ�����

	}

	//������������д����ķ��������ӷ�����
	@Override
	protected void hookMethod() {
		// ���ҵ�����
		super.hookMethod();
	}
}
