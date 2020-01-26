package com.cts.training.fibonaci;


import java.util.Scanner;

public class Fibonaci {
	public static void main(String[] args) {
                 int t1=0,t2=1,i,n=10;
                 System.out.println("first" + n + "terms :");
                 //Scanner sc=new Scanner(System.in);
                 //System.out.println("enter t1:");
                // System.out.println("enter t2:");
                 for(i=1;i<=n;++i){
                	 System.out.println(t1+ "+");
                	 int sum=t1+t2;
                	 t1=t2;
                	 t2=sum;
                	
                 }
                 
	}
}
