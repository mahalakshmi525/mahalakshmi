package com.cts.training.window;

import java.util.Scanner;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
	     System.out.println("enter a string :");
	     //String s=sc.nextLine();
		while(sc.hasNext())
		{
			System.out.println(sc.next());
		}

	}
}

	
