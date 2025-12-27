package com.tnsif.intro.inheritance;

public class A {
	public void show() {
		System.out.println("A");
		
	}
}
class Bee extends A{
	public void show1() {
		System.out.println("B");
}
}
class Cee extends Bee{
	public void show2() {
		System.out.println("C");
	}
}
class D extends A{
	public void show3() {
			System.out.println("D");
}
}
class E extends A{
	public void show4() {
		System.out.println("E");

}
}
