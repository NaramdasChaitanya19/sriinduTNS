package com.tnsif.intro.day1;
import java.util.Scanner;

public class day3sca {

	public static void main(String[] args) {
		Scanner sac=new Scanner(System.in);
		System.out.println("Enter number:" );
        int a=sac.nextInt();
        switch(a) {
		case 1:
			System.out.println("Best");
			break;
		case 2:
			System.out.println("Better");
			break;
		case 3:
			System.out.println("Good");
			break;
		case 4:
			System.out.println("Nice");
			break;
		default:
			System.out.println("Worst");
			break;
	}


	}

}
