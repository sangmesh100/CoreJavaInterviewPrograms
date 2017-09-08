package com.sam.arrayNumEquals;

public class ArrayNumEqualsDemo {
	public static void main(String[] args) {

		int arrOne[] = { 1, 2, 3, 4, 5 };
		int arrTwo[] = { 1, 2, 3, 4, 5 };

		boolean arryEqualsOrNot = true; // must be true

		if (arrOne.length == arrTwo.length) {
			for (int i = 0; i < arrOne.length; i++) {
				if (arrOne[i] != arrTwo[i]) {
					arryEqualsOrNot = false;
				}
			}
		} else {
			arryEqualsOrNot = false;
		}

		if (arryEqualsOrNot) {
			System.out.println("Both array is equals");
		} else {
			System.out.println("Both array is NOT equals");
		}

	}

}
