package com.cts.training.palindrome;

import java.util.Scanner;

public class Palindrdome {
	public static void main(String[] args) {
	        int temp,sum=0,r,n;
	        Scanner sc=new Scanner(System.in);
	        System.out.println("enter number:");
	        n= sc.nextInt();
	        temp=n;
	        while(n!=0){
	        	 r=n%10;
	        	 sum = sum*10+r;
	        	 n=n/10;
	        }
	        if(temp==sum){
	        	 System.out.println(" number is palindrome");
	        }else{
	        	 System.out.println("not a palindrome");
	        }
	}
}
