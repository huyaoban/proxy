package com.huyaoban.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class CalculatorProxy implements InvocationHandler {
	private Object cal;

	public CalculatorProxy(Object cal) {
		this.cal = cal;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// 调用前打印参数日志
		System.out.println("method = " + method);
		System.out.println("num1 = " + args[0] + ", num2 = " + args[1]);

		Object ret = method.invoke(cal, args);

		// 调用后打印结果日志
		System.out.println("ret = " + ret);

		return ret;
	}

}
