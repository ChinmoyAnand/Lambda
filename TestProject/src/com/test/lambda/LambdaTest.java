package com.test.lambda;

public class LambdaTest {
	
	public static void main(String[] args) {
		addLam addLambda = (int a,int b) -> a+b;
		System.out.println( addLambda.add(10, 20));
	}
	
	interface addLam{
		public int add(int x,int y);
	} 

}
