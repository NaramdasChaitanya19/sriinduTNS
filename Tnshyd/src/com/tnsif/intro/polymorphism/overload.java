package com.tnsif.intro.polymorphism;

public class overload {
	public void show() {
		System.out.println("this is show method with no parameters");	
		}
		public void show(int a) {
			System.out.println("this is show method with Single parameter" +a);	
	}
		public void show(int a,double b) {
			System.out.println("this is show method with two  parameters" +a+" "+b);	
			
	}
		public void show(double b,int a,float c) {
			System.out.println("this is show method with sequence differ" +b+" "+a+" "+c);	
	}
	
}

