package org.github.mervyn.designPatterns.templateMethod;

public abstract class AbstractClass {
	/**
	 * 模版方法
	 * */
	public void templateMethod(){
		//调用方法
		abstractMethod();
		hookMethod();
		concreteMethod();
	}
	
	/**
	 * 基本方法的声明（由子类实现）
	 * */
	protected abstract void abstractMethod();
	
	/**
	 * 基本方法（空方法）
	 * */
	protected void hookMethod(){
		
	}
	
	/**
	 * 基本方法（已经实现）
	 * */
	private final void concreteMethod(){
		//业务相关代码（这里已省略）
	} 
}
