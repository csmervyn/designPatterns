package org.github.mervyn.designPatterns.builder;

public class ConcreteBuilder extends Builder {

	private Product product = new Product();
	
	//���ò�Ʒ���
	@Override
	public void setPart() {
		// ��Ʒ���ҵ���߼�����

	}

	//���һ����Ʒ
	@Override
	public Product buildProduct() {
		// TODO Auto-generated method stub
		return product;
	}

}
