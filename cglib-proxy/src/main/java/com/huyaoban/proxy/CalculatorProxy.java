package com.huyaoban.proxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CalculatorProxy implements MethodInterceptor {

	public <T> T getProxy(Class<T> clazz) {
		return (T) Enhancer.create(clazz, this);
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy methodProxy) throws Throwable {
		// 调用前打印参数日志
		System.out.println("method = " + method);
		System.out.println("num1 = " + args[0] + ", num2 = " + args[1]);

		Object ret = methodProxy.invokeSuper(obj, args);

		// 调用后打印结果日志
		System.out.println("ret = " + ret);

		return ret;
	}


}
