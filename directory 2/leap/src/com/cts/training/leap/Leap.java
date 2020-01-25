package com.cts.training.leap;

import java.util.Scanner;

public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		//int year;
		System.out.println("enter year:");
		int year=sc.nextInt();
		if(year%4==0) {
			if(year%100==0) {
				System.out.println("Leap year:" +year);
			}
			System.out.println("not a Leap year");
		}

	}

}
