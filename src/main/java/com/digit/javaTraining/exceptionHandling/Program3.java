package com.digit.javaTraining.exceptionHandling;

import java.util.Scanner;

class Operations{
	void function1() throws ArithmeticException {
		try {
			System.out.println("Inside func-1");
			Scanner sc = new Scanner(System.in);
			System.out.println("Division Operation");
			System.out.println("Enter the numerator : ");
			int num = sc.nextInt();
			System.out.println("Enter the denominator: ");
			int den = sc.nextInt();

			int res = num/den;//CS
			System.out.println("Division result is : "+res);

		}
		catch (Exception e) {
			System.out.println("Exception handled in Function-1");
			throw e;
		}
		finally {
			System.out.println("left func-1");
		}
	}


}
public class Program3 {
	public static void main(String[] args)throws Exception {
		try {
			System.out.println("Inside Main");
			Operations op = new Operations();
			op.function1();
			
		}
		catch (Exception e) {
			System.out.println("Exception handled in main");
		}
		finally {
			System.out.println("left main");
		}

	}
}
