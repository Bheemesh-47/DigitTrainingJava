package com.digit.javaTraining.multithreading;

import java.util.Scanner;

public class Program2 {
	public static void main(String[] args) throws InterruptedException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Operation");
		System.out.println("Enter the accno:");
		int accno = sc.nextInt();
		System.out.println("Enter the pin:");
		int pin = sc.nextInt();
		System.out.println("Banking completed");
		
		System.out.println("Printing Operation");
		for(int i=1;i<=5;i++) {
			System.out.println("Hi Good Morning");
			Thread.sleep(3000);
		}
		System.out.println("Printing completed");
		
		System.out.println("Addition Operation");
		System.out.println("Enter num1 :");
		int num1 = sc.nextInt();
		System.out.println("Enter num2 :");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("The result is : "+res);
		System.out.println("Addition completed");

				
	}
}
