package com.digit.javaTraining.arrayPrograms;

import java.util.Scanner;

/*
 * 	School	class	Students
 * 	   0	  0			2
 * 	   		  1			3
 *  	 	  2			4
 * 	   1	  0			2
 * 	   		  1			3
 *  	 	    
 */
public class ArrayCode4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the COunt of the school:");
		int scl = sc.nextInt();
		
		int arr[][][] = new int[scl][][];
		
		//To complete the count of the classes
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the Count of the class inside the "
					+ "school:"+(i+1));
			int cls = sc.nextInt();
			arr[i] = new int[cls][];
		}
		
		//To complete the count of students 
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the school : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the student count inside the class:"
			+(j+1));
				int stu = sc.nextInt();
				arr[i][j] = new int[stu];
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the school : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the class : "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the marks of student no: "
				+(k+1));
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Inside the school : "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Inside the class : "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println(" the marks of student no: "
				+(k+1)+" is :"+arr[i][j][k]);
				}
			}
		}
	}
}
