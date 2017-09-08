package com.sam.exception.customeExceptionOrUserdefineException;

import java.util.Scanner;

public class CustomExceptionHandling {

	public static void main(String[] args) {

		int balance = 5000; //Initializing the balance

		Scanner scanner = new Scanner(System.in);//Scanner variable to take input from user
		
		System.out.println("Enter withdrow money :");
		
		int withdrowMoney = scanner.nextInt();//taking input from the user

		try {
			//checking withdrawl money with the balance
            //if withdrawl money is more than the balance,
            //then it throws Exception
			if (withdrowMoney > balance) {

				throw new InvalidWithdrowMoneyException();

			} else {

				System.out.println("Trasaction successfully");
			}

		} catch (InvalidWithdrowMoneyException e) {
			
			//InvalidWithdrawlMoneyException will be caught here
			System.out.println(e);
		}
	}
}
