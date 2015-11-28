package org.github.mervyn.designPatterns.simpleFactory;

public class Creator {
	public static Product createProduct(){
		return new ConcreteProduct();
	}
}
