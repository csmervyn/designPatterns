package org.github.mervyn.designPatterns.builder;

public class Director {
	private Builder builder = new ConcreteBuilder();
	
	//构建不同的产品
	public Product getAProduct(){
		/*
		 * 设置不同的零件，产生不同的产品
		 * */
		return builder.buildProduct();
	}
}
