package com.cts.training.factorial;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            int i,fact = 1,n;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter number:");
            n=sc.nextInt();
            for(i=1;i<=n;i++){
            	fact=fact*i;
            }
         System.out.println("fact is :" +fact);   
	}

}
