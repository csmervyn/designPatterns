package org.github.mervyn.designPatterns.prototype;

public class Prototype implements Cloneable {

	//覆盖父类的clone方法
	public Prototype clone(){
		Prototype prototype = null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prototype;
	}

}
