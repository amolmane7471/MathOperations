package com.bridgelabz.lambdaexpression;

public class MathOperation {

	public static void main(String[] args) {
		System.out.println("Welcome to lambda expression : math operation");

		MathFunctionIF add = Integer::sum;
		MathFunctionIF subtract = (int a, int b) -> a-b;
		MathFunctionIF multiply = (int a, int b) -> a*b;
		MathFunctionIF divide = (int a, int b) -> {
			if(b==0)return 0;
			return a/b;
		};		
		
		MathFunctionIF.printResult(6, 5, "ADDITION", add);
		MathFunctionIF.printResult(6, 5, "SUBTRACT", subtract);
		MathFunctionIF.printResult(6, 5, "MULTIPLY", multiply);
		MathFunctionIF.printResult(6, 0, "DIVIDE", divide);

	}
}
