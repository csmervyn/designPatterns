package org.github.mervyn.designPatterns.proxy;

public class RealSubject extends Subject {

	@Override
	public void request() {
		//ִ��ҵ�����ز���
		System.out.println("����ҵ�񷽷�...");
	}

}
