package com.cts.training.graduation1;

import java.util.Scanner;

public class Graduation {
        public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name :");
		String name=sc.nextLine();
		if(!name.matches("^[a-zA-Z]*$"))
			System.out.println("invalid name");
		System.out.println("enter your Graduation: ");
		int year = sc.nextInt();
		if(!year.equals("^[0-9]*$"||"^[a-zA-Z]*$")
			System.out.println("invalid graduation");
		System.out.print(" my  name is: " +name );
		System.out.print("  i will  Graduate in:" +year);
	}
}


		
