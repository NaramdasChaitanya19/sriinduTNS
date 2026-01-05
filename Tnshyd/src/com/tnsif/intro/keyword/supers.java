package com.tnsif.intro.keyword;

public class supers {
	int a=20;
	supers(int b){
		System.out.println("contructor of parent");
	}
	public void show() {
		System.out.println("parent method");
	}
		
}
class samu  extends supers{
	samu(){
		super(56);
	}
	int a=40;
	public void display() {
		System.out.println(super.a);
		super.show();
		System.out.println("child class");
		
	}
}
