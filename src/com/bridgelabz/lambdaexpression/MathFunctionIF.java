package com.bridgelabz.lambdaexpression;

interface MathFunctionIF{
	int calculate(int a, int b);
	static void printResult(int a, int b, String function, MathFunctionIF functionObject) {
		System.out.println("RESULT OF " +function+" is "+functionObject.calculate(a,b));
	}
}