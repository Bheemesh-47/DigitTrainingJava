package com.digit.javaTraining.multithreading;

public class Program1 {
	static {
		try {
			Thread.sleep(3000);
			Thread t2 = new Thread();
			System.out.println(t2);
			t2.setPriority(7);
			System.out.println(t2);
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		//		Thread t1 = new Thread();
		//		System.out.println(t1);
		//		t1.setName("vipul");
		//		t1.setPriority(2);
		//		System.out.println(t1);
		//		Thread t2 = new Thread();
		//		System.out.println(t2);
		System.out.println(Thread.currentThread());
		Thread t1 = new Thread();
		System.out.println(t1);

	}
}
