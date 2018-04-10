package com.huyaoban.proxy;

import net.sf.cglib.proxy.Enhancer;

public class Main {

	public static void main1(String[] args) {
		CalculatorProxy proxy = new CalculatorProxy();

		CalculatorImpl cal = proxy.getProxy(CalculatorImpl.class);

		// 使用代理类
		cal.add(1, 2);
		cal.minus(4, 10);
	}

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(CalculatorImpl.class);
		enhancer.setCallback(new CalculatorProxy());

		CalculatorImpl cal = (CalculatorImpl) enhancer.create();

		// 使用代理类
		cal.add(1, 2);
		cal.minus(4, 10);
	}

}
