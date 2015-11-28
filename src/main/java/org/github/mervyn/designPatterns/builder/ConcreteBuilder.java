package org.github.mervyn.designPatterns.builder;

public class ConcreteBuilder extends Builder {

	private Product product = new Product();
	
	//设置产品零件
	@Override
	public void setPart() {
		// 产品类的业务逻辑处理

	}

	//组件一个产品
	@Override
	public Product buildProduct() {
		// TODO Auto-generated method stub
		return product;
	}

}
