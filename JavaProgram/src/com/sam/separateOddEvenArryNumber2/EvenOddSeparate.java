package com.sam.separateOddEvenArryNumber2;

import java.util.Scanner;

public class EvenOddSeparate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter array size: ");

		int number = scanner.nextInt();
		int numArr[] = new int[number];

		System.out.println("Enter array elements: ");
		for (int i = 0; i < number; i++) {
			numArr[i] = scanner.nextInt();
		}

		System.out.println("Odd Numbers: ");
		for (int i = 0; i < number; i++) {
			if (numArr[i] % 2 != 0) {
				System.out.println(numArr[i] + "");
			}
		}

		System.out.println("Even Numbers: ");
		for (int i = 0; i < number; i++) {
			if (numArr[i] % 2 == 0) {
				System.out.println(numArr[i] + "");
			}
		}
	}
}
