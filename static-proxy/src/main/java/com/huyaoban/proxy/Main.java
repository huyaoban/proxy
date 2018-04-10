package com.huyaoban.proxy;

public class Main {

	public static void main(String[] args) {
		Calculator cal = new CalculatorImpl();

		Calculator proxy = new CalculatorProxy(cal);

		// 使用代理类
		proxy.add(1, 2);
		proxy.minus(4, 10);
	}

}
