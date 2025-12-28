package com.tnsif.assessment;
import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {


		        int count = 0, num = 2;

		        while (count < 20) {
		            boolean prime = true;

		            for (int i = 2; i <= num / 2; i++) {
		                if (num % i == 0) {
		                    prime = false;
		                    break;
		                }
		            }

		            if (prime) {
		                System.out.print(num + " ");
		                count++;
		            }
		            num++;
		        }
		    }
	}
