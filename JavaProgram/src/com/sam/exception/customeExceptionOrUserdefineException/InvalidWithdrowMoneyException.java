package com.sam.exception.customeExceptionOrUserdefineException;

//Defining Our own exception class by extending ArithmeticException class

@SuppressWarnings("serial")
public class InvalidWithdrowMoneyException extends ArithmeticException {
	
	
	//Overriding toString() method of ArithmeticException as per our needs
	
	@Override
	public String toString() {
	
		return "you don`t have that much money in your account";
	}

}
