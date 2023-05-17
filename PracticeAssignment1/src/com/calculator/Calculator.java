package com.calculator;

public class Calculator {
	int num1, num2;

	public Calculator(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public int add() {
		return num1+num2;
	}
	
	public int sub() {
		return num1-num2;
	}
	
	public int mul() {
		return num1*num2;
	}
	
	public float div() {
		float result = 0.0f;
		try {
			result = (float)num1/(float)num2;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return result;
		 
	}
	

}
