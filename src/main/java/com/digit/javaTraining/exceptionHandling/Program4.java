package com.digit.javaTraining.exceptionHandling;

import java.util.Scanner;

class UnderAgeExecption extends Exception {
	public String getMessage() {
		return "Your age is less that 18, hence you are a kid. Please try after few years";
	}
}
class OverAgeExecption extends Exception {
	public String getMessage() {
		return "Your age is more that 60, hence stop having more desires";
	}
}

//RTO
class Candidate{
	int age;
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		age = sc.nextInt();
	}
	void verify() throws Exception{
		if(age<18) {
			UnderAgeExecption uae = new UnderAgeExecption();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else if(age>60) {
			OverAgeExecption oae = new OverAgeExecption();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else {
			System.out.println("Issue the license");
		}
	}
}

class RTO{
	void grantLicense(Candidate c) {
		try {
			c.getData();
			c.verify();//cs
		}
		catch (Exception e1) {
			try {
				c.getData();
				c.verify();//cs
			}
			catch (Exception e2) {
				try {
					c.getData();
					c.verify();//cs
				}
				catch (Exception e3) {
					System.out.println("Go Home you have crossed your limits");
				}
			}
		}
	}
}
public class Program4 {
	public static void main(String[] args) {
		Candidate c1 = new Candidate();
		RTO rto = new RTO();
		rto.grantLicense(c1);
	}
}
