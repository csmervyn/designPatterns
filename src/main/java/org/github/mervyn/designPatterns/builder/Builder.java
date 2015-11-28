package org.github.mervyn.designPatterns.builder;

public abstract class Builder {
	//设置产品的不同部分，以获得不同的产品
	public abstract void setPart();
	
	//构建产品
	public abstract Product buildProduct();
}
