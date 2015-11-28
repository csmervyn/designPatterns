package org.github.mervyn.designPatterns.proxy;

public class RealSubject extends Subject {

	@Override
	public void request() {
		//执行业务的相关操作
		System.out.println("我是业务方法...");
	}

}
