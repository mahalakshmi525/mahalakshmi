package com.cts.training.upper;

import java.util.Scanner;

public class Upper {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter string:");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++){
			 char c=s.charAt(i);
			 if(i%2==0)
			 c=Character.toUpperCase(c);
			 System.out.print(c);
		}
	}
}
