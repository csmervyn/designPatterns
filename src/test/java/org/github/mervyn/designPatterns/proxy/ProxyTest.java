package org.github.mervyn.designPatterns.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProxyTest {

	@Test
	public void test() {
		Subject subject = new Proxy();
		subject.request();
	}

}
