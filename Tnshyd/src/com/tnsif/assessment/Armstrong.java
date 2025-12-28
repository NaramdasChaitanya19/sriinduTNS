package com.tnsif.assessment;
import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {


		        Scanner sc = new Scanner(System.in);

		        int num, temp, digit;
		        int sum = 0;

		        System.out.print("Enter a number: ");
		        num = sc.nextInt();

		        temp = num;  

		        while (num != 0) {
		            digit = num % 10;          
		            sum = sum + (digit * digit * digit); 
		            num = num / 10;            
		        }

		        if (temp == sum)
		            System.out.println("Armstrong number");
		        else
		            System.out.println("Not an Armstrong number");

		        sc.close();
		    }
	}


