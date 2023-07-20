package com.digit.javaTraining.multithreading;

class Gender extends Thread{
	public void run() {
		try {
			System.out.println(Thread.currentThread().getName()+" entered the bathroom");
			Thread.sleep(4000);
			System.out.println(Thread.currentThread().getName()+" is using the bathroom");
			Thread.sleep(6000);
			System.out.println(Thread.currentThread().getName()+" has left the bathroom");
			Thread.sleep(5000);
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
public class Program6 {
	public static void main(String[] args) throws InterruptedException {
		Gender g1 = new Gender();
		g1.setName("boy");
		Gender g2 = new Gender();
		g2.setName("girl");
		Gender g3 = new Gender();
		g3.setName("others");
		
		g1.start();
		g1.join();
		g2.start();
		g2.join();
		g3.start();
	}
}
