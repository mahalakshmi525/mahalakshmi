package com.cts.training.graduation;

import java.util.Scanner;

public class Graduation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name :");
		String name=sc.nextLine();
		System.out.println("enter your Graduation: ");
		
		int graduation = sc.nextInt();
		System.out.print(" my  name is: " +name );
		System.out.print("  i will  Graduate in:" +graduation);
	}
	}


