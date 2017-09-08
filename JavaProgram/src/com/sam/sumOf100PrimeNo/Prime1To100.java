package com.sam.sumOf100PrimeNo;

/*
 * This Java program calculates and prints the sum of all prime numbers 
 * between 1 and 100.
 */


public class Prime1To100 
{
	public static void main(String[] args) 
	{
		int sum=0, i, j, k;
		for(i=1; i<100; i++)
		{
			k=0;
			for(j=2; j<i; j++)
			{
				if(i%j==0)
				{
					k=1;
					break;
					
				}
			}
			if(k==0)
			{
				sum=sum+i;
			}
			
		}
		
		System.out.println("Sum is: "+ sum);
	}
}
/*
o/p:Sum is: 1061
*/