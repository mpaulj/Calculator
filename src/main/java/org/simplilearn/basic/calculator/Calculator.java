package org.simplilearn.basic.calculator;

public class Calculator {
	
	

		public int add(int i, int j)
		{
		return i+j;
		}
		
		public int divide(int i, int j)
		{
		return i/j;
		}
		
		
		public static void main(String[] args) {
			Calculator calculator=new Calculator();
			int sum=calculator.add(10, 20);
			System.out.println("sum is "+sum);
			

		}
}
