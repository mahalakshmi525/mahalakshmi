package com.cts.training.swap;

public class Swap {

	public static void main(String[] args) {
		int a=10 ,b=15 ,t=4;
		System.out.println("before swapping ");
		System.out.println("value of a is :" +a);
		System.out.println("value of b is :" +b);
		
		 t=a;
		a=b;
		b=t;
		System.out.println("after swapping ");
		System.out.println("a value is :" +a);
		System.out.println("b vlaue is:"+b);
}
}
