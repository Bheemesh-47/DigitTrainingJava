package com.digit.javaTraining.arrayPrograms;

import java.util.Scanner;

/*	  i			j
 * 	class	students
 * 	  0			2
 * 	  1			3 
 * 	  2			4 
 * 	  3			5
 */

public class ArrayCode2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the count of the classes");
		int cls = sc.nextInt();

		String arr[][] =  new String[cls][];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the count of students in class : "+(i+1));
			int stu = sc.nextInt();
			arr[i] = new String[stu];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class - "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("Enter the name of the Student no: "+(j+1));
				arr[i][j] = sc.next();
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside class - "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("the name of the Student no: "
						+(j+1)+" is : "+arr[i][j]);
			}
		}
		
	}
}
