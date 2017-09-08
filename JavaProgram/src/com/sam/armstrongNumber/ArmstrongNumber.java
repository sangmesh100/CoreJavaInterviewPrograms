package com.sam.armstrongNumber;

public class ArmstrongNumber {

	public static void main(String[] args) {
		checkArmstrongNumber(153);
	}

	private static void checkArmstrongNumber(int number) {
		
		int copyOfNumber = number;
		int noOfDigit = String.valueOf(number).length();
		int sum = 0;

		while (copyOfNumber != 0) {
			
			int lastDigit = copyOfNumber % 10;
			int powerOfNoOfDigit = 1;
			
			for (int i = 0; i < noOfDigit; i++) {
				powerOfNoOfDigit = powerOfNoOfDigit * lastDigit;
			}
			
			sum = sum + powerOfNoOfDigit;
			copyOfNumber = copyOfNumber / 10;
		}
		
		if (sum == number) {
			System.out.println(number + " is an ArmstrongNumber");
		} else {
			System.out.println(number + " is an NOT ArmstrongNumber");
		}
	}
}
/*
OUTPUT: 153 is an ArmstrongNumber
*/