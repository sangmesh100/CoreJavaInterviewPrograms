package com.sam.separateOddEvenArryNumber1;
/*
Java program to assemble all odd number together and all even number together in random array
*/
import java.util.Scanner;

public class EvenOddSeparate {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter no of array size :");

		int number = scanner.nextInt();
		int numArr[] = new int[number];

		System.out.println("Enter the array elements ");
		for (int i = 0; i < number; i++) {
			numArr[i] = scanner.nextInt();
		}

		System.out.println("Odd elements: ");
		for (int i = 0; i < number; i++) {
			if (numArr[i] % 2 != 0) {
				System.out.println(numArr[i] + " ");
			}
		}

		System.out.println("Even elements: ");
		for (int i = 0; i < number; i++) {
			if (numArr[i] % 2 == 0) {
				System.out.println(numArr[i] + " ");
			}
		}
	}
}
