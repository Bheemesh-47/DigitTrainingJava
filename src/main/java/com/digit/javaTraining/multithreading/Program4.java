package com.digit.javaTraining.multithreading;

import java.util.Scanner;

class Banking implements Runnable{

	public void run() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Operation");
		System.out.println("Enter the accno:");
		int accno = sc.nextInt();
		System.out.println("Enter the pin:");
		int pin = sc.nextInt();
		System.out.println("Banking completed");
	}
}

class Printing implements Runnable{

	public void run() {
		System.out.println("Printing Operation");
		for(int i=1;i<=5;i++) {
			System.out.println("Hi Good Morning");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Printing completed");
	}
}
class Addition implements Runnable{

	public void run() {
		Scanner sc = new Scanner(System.in);
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
public class Program4 {
	public static void main(String[] args) {
		Banking b = new Banking();
		Printing p = new Printing();
		Addition a = new Addition();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(p);
		Thread t3 = new Thread(a);
		
		t1.start();
		t2.start();
		t3.start();
	}
}
