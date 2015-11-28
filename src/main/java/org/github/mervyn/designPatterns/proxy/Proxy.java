package org.github.mervyn.designPatterns.proxy;

public class Proxy extends Subject {
	private Subject subject = new RealSubject();

	@Override
	public void request() {
		this.beforeRequest();
		this.subject.request();
		this.afterRequest();
	}
	
	//����Ŀ�����֮ǰ��������ز���
	private void beforeRequest(){
		System.out.println("Ԥ����...");
	}
	
	//����Ŀ�����֮���������ز���
	private void afterRequest(){
		System.out.println("�ƺ���...");
	}
}
