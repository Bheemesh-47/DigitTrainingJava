package com.digit.javaTraining.multithreading;

import java.util.Scanner;

class Operations extends Thread{
	
	public void run() {
		if(Thread.currentThread().getName().equals("banking")) {
			banking();
		}
		else if(Thread.currentThread().getName().equals("printing")) {
			printing();
		}
		else {
			add();
		}
	}
	
	void banking() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Banking Operation");
		System.out.println("Enter the accno:");
		int accno = sc.nextInt();
		System.out.println("Enter the pin:");
		int pin = sc.nextInt();
		System.out.println("Banking completed");
	}
	void add() {
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
	void printing() {
		System.out.println("Printing Operation");
		for(int i=1;i<=5;i++) {
			try {
				System.out.println("Hi Good Morning");
				Thread.sleep(3000);
			}
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("Printing completed");
	}
}

public class Program3 {
	public static void main(String[] args) {
		System.out.println("Main Started");
		Operations op1 = new Operations();
		op1.setName("banking");
		op1.setPriority(3);
		Operations op2 = new Operations();
		op2.setName("printing");
		op2.setPriority(8);
		Operations op3 = new Operations();
		op3.setName("add");
		
		op1.start();
		op2.start();
		op3.start();
		System.out.println("Main terminated");
	}
}
