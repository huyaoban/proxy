package com.huyaoban.proxy;

public class CalculatorImpl implements Calculator {

	@Override
	public int add(int num1, int num2) {
		int ret = num1 + num2;
		return ret;
	}

	@Override
	public int minus(int num1, int num2) {
		int ret = num1 - num2;
		return ret;
	}

}
