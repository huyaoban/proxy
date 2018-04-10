package com.huyaoban.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Main {

	public static void main(String[] args) {
		Calculator cal = new CalculatorImpl();

		InvocationHandler handler = new CalculatorProxy(cal);

		// 设置此属性，可以让生成的代理类自动保存到文件中，默认路径为com/sun/proxy
		System.getProperties().put(
				"sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

		// 生成代理对象
		Calculator proxy = (Calculator) Proxy.newProxyInstance(handler
				.getClass().getClassLoader(), cal.getClass().getInterfaces(),
				handler);

		// 使用代理类
		proxy.add(1, 2);
		proxy.minus(4, 10);
	}

}
