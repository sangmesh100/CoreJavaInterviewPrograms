package com.sam.separateOddEvenArryNumber;

/*
Java program to assemble all odd number together and all even number together in random array
*/
import java.util.Scanner;

public class Even_Odd

{

	public static void main(String[] args)

	{

		int n;

		Scanner s = new Scanner(System.in);

		System.out.print("Enter no. of elements you want in array:");

		n = s.nextInt();

		int a[] = new int[n];

		System.out.println("Enter all the elements:");

		for (int i = 0; i < n; i++)

		{

			a[i] = s.nextInt();

		}

		System.out.print("Odd numbers:");

		for (int i = 0; i < n; i++)

		{

			if (a[i] % 2 != 0)

			{

				System.out.print(a[i] + " ");

			}

		}

		System.out.println("");

		System.out.print("Even numbers:");

		for (int i = 0; i < n; i++)

		{

			if (a[i] % 2 == 0)

			{

				System.out.print(a[i] + " ");

			}

		}

	}

}

/*
 * Enter no. of elements you want in array:15 Enter all the elements: 0 1 0 1 1
 * 1 0 0 0 1 2 3 5 8 6 Odd numbers:1 1 1 1 1 3 5 Even numbers:0 0 0 0 0 2 8 6
 */