package com.tnsif.intro.Exception;

public class Exception {

	public static void main(String[] args) {

		try {
			int a=29;
			int b=0;
			int c=a/b;
			System.out.println(c);

		}catch(ArithmeticException e){
			System.out.println("Division is not possible");

			
		}
		try {
		int[] arr= {1,4,3,5,6,7};
		System.out.println(arr[0]);
		System.out.println(arr[7]);
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("There is no element at arr[6]");
			}
		try {
		String s=null;
		System.out.println(s.length());
		}catch(NullPointerException e) {
			System.out.println("Can't get the length of string");

		}

	}



	}


