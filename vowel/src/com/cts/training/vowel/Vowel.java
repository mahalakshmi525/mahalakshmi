package com.cts.training.vowel;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc= new Scanner(System.in);
		char ch='f' ;
		System.out.println("enter ch:");
		if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			System.out.println(+ ch + " is vowel");
		}
		else {
			System.out.println(ch+ " is consonant");
			
		}
		

	}

}
