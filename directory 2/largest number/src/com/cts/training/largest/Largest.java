package com.cts.training.largest;

import java.util.Scanner;

public class Largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		//int a,b,c;
		System.out.println("enter a value: ");
		System.out.println("enter b value :");
		System.out.println("enter c value :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b && a>=c) {
			System.out.println("a is largest");
			
		}if(b>=c && b>=a)
		{
			System.out.println("b is largest");
		}else
		{
			System.out.println("c is largest");
		}

	}

}
