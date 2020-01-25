package com.cts.training.even;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number: ");
		int n = sc.nextInt();
		if(n%2==0)
		{
			System.out.println("n is even");
		}else
		{
			System.out.println("n is odd");
		}

	}
}
