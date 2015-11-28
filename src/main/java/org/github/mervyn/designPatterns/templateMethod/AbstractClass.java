package org.github.mervyn.designPatterns.templateMethod;

public abstract class AbstractClass {
	/**
	 * ģ�淽��
	 * */
	public void templateMethod(){
		//���÷���
		abstractMethod();
		hookMethod();
		concreteMethod();
	}
	
	/**
	 * ����������������������ʵ�֣�
	 * */
	protected abstract void abstractMethod();
	
	/**
	 * �����������շ�����
	 * */
	protected void hookMethod(){
		
	}
	
	/**
	 * �����������Ѿ�ʵ�֣�
	 * */
	private final void concreteMethod(){
		//ҵ����ش��루������ʡ�ԣ�
	} 
}
