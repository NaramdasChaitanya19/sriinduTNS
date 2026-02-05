package com.tnsif.intro.Exception;

public class throwException {

	public static void main(String[] args) {
		int age=14;
		if(age>18) {
			System.out.println("Eligible for voting");
		}
		else {
				throw new ArithmeticException("Not Eligible for voting");

			}

	}

}
