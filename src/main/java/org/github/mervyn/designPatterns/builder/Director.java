package org.github.mervyn.designPatterns.builder;

public class Director {
	private Builder builder = new ConcreteBuilder();
	
	//������ͬ�Ĳ�Ʒ
	public Product getAProduct(){
		/*
		 * ���ò�ͬ�������������ͬ�Ĳ�Ʒ
		 * */
		return builder.buildProduct();
	}
}
