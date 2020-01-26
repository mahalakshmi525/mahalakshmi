package com.cts.training.positive;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int n=0;
		Scanner sc=new Scanner (System.in);
		System.out.println("enter your numner: ");
		int n=sc.nextInt();
		if(n>0){
		System.out.println("number is positive");
		}else{
		System.out.println("number is negative");
		}

	}

}
