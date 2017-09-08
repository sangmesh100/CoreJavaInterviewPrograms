package com.sam.palindromeString;

import java.util.Scanner;

public class PalindromeString {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter string: ");

		String str = scanner.nextLine();
		String reverse = "";	// not space allowed
		int len = str.length();

		for (int i = len - 1; i > -1; i--) {
			reverse = reverse + str.charAt(i);
		}
		if (str.equals(reverse)) {
			System.out.println("String is palindrome");
		} else {
			System.out.println("String is not palindrome");
		}
		
	}
}
