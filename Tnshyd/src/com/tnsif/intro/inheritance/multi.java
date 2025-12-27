package com.tnsif.intro.inheritance;

public class multi {
	public void show() {
		System.out.println("parent");
		
	}
}
	class B extends multi{
		public void display() {
		System.out.println("Child");
	}
	}
	class C extends B{
		public void miss() {
			System.out.println("Subclass");
		}
	}



