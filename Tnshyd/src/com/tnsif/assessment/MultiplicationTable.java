package com.tnsif.assessment;
import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {

		Scanner sec=new Scanner(System.in);
		System.out.println("Enter the number:" );
		int n=sec.nextInt();
		System.out.println("Multipliction table of " +n+ " is");
		
		for(int i=1;i<=10;i++) {
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		sec.close();

	}



	}


