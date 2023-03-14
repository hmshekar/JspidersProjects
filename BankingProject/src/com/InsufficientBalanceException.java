package com;

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	InsufficientBalanceException(String message){
		this.message=message;
	}
	@Override
	public String getMessage() {
		return message;
	}
}
/** Rules To work with custom /user defined Exception
1. create a class with exception name
2a. if a class extends RunTimeException ->Unchecked Exception
2b. if a class extends Exception ->Checked Exception
3. Override getMessage()->(variable,Constructor, method)
4. Invoke the Exception using throw keyword,
	handle it using try and catch block with suitable message
*/