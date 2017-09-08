package com.sam.primenumber;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {

		int rem = 0, flag = 0;

		System.out.println("Enter any number: ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();

		rem = number / 2;

		for (int i = 2; i <= rem; i++) {
			if (number % i == 0) {
				System.out.println("Not prime number");
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println("Is prime number ");
		}

	}

}
