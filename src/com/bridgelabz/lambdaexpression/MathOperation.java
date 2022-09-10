package com.bridgelabz.lambdaexpression;

public class MathOperation {

	public static void main(String[] args) {
		System.out.println("Welcome to lambda expression : math operation");
		MathFunctionIF add = Integer::sum;
		MathFunctionIF subtract = (int a, int b) -> a-b;
		MathFunctionIF multiply = (int a, int b) -> a*b;
		MathFunctionIF divide = (int a, int b) -> a/b;
		
		System.out.println("ADD: "+add.calculate(8, 8));
		System.out.println("SUBTRACT: "+subtract.calculate(6, 8));
		System.out.println("MULTIPLY: "+multiply.calculate(6, 4));
		System.out.println("DIVIDE: "+divide.calculate(6, 8));
		
	}
}
