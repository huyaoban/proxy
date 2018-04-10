package com.huyaoban.proxy;

/**
 * 没有实现接口
 * 
 * @author huyao
 *
 */
public class CalculatorImpl {

	public int add(int num1, int num2) {
		int ret = num1 + num2;
		return ret;
	}

	public int minus(int num1, int num2) {
		int ret = num1 - num2;
		return ret;
	}

}
