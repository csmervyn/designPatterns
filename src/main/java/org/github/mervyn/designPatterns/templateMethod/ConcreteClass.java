package org.github.mervyn.designPatterns.templateMethod;

public class ConcreteClass extends AbstractClass {
	//基本方法实现
	@Override
	protected void abstractMethod() {
		// 相关业务代码

	}

	//基本方法，重写父类的方法（钩子方法）
	@Override
	protected void hookMethod() {
		// 相关业务代码
		super.hookMethod();
	}
}
