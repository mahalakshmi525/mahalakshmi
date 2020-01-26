package com.cts.training.table;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your number:");
		n=sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.printf("%d * %d = %d \n",n ,i,n*i);
		}

	}

}
