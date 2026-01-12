package com.tnsif.assessment;

public class Teamwork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] word= {{'T','E','A','M'},{'W','O','R','K'}};
		String text="";
		for (int i = 0; i < word.length; i++) {
		    for (int j = 0; j < word[i].length; j++) {
		        text+=word[i][j];
		        }
		}
		    System.out.println(text);
		
		String reverse="";

	    for (int i = text.length() - 1; i >= 0; i--) {
	        reverse +=text.charAt(i);
	    }

	    System.out.println(reverse);


		}
	

	}


