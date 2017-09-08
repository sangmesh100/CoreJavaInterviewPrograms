package com.sam.palindromeNumber;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {

		int orig, rem, reverse = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the any number : ");

		int number = scanner.nextInt();
		orig = number;

		while (number != 0) {
			rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}
		if (orig == reverse) {
			System.out.println("Palindrome number");
		} else {
			System.out.println("Not palindrome number");
		}
	}
}
