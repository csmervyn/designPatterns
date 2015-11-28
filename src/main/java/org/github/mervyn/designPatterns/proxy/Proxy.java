package org.github.mervyn.designPatterns.proxy;

public class Proxy extends Subject {
	private Subject subject = new RealSubject();

	@Override
	public void request() {
		this.beforeRequest();
		this.subject.request();
		this.afterRequest();
	}
	
	//调用目标对象之前可以做相关操作
	private void beforeRequest(){
		System.out.println("预处理...");
	}
	
	//调用目标对象之后可以做相关操作
	private void afterRequest(){
		System.out.println("善后处理...");
	}
}
