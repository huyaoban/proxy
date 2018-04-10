package com.huyaoban.proxy;

public class CalculatorProxy implements Calculator {
	private Calculator cal;

	public CalculatorProxy(Calculator cal) {
		this.cal = cal;
	}

	@Override
	public int add(int num1, int num2) {
		// 调用前打印参数日志
		System.out.println("num1 = " + num1 + ", num2 = " + num2);

		int ret = cal.add(num1, num2);

		// 调用后打印结果日志
		System.out.println("ret = " + ret);

		return ret;
	}

	@Override
	public int minus(int num1, int num2) {
		// 调用前打印参数日志
		System.out.println("num1 = " + num1 + ", num2 = " + num2);

		int ret = cal.minus(num1, num2);

		// 调用后打印结果日志
		System.out.println("ret = " + ret);

		return ret;
	}

}
