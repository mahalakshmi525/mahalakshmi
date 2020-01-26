package com.cts.training.alphabet;

import java.util.Scanner;

public class Alphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c ='*';
		//Scanner sc=new Scanner(System.in);
		//String c =sc.next();
		if((c >= 'a' && c <= 'z')||(c >='A' && c <='Z')){
			System.out.println( c+  "is an alphabet");
		}else{
			System.out.println(c+ " is not an alphabet");
		}
	}

}
