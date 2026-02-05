package com.tnsif.intro.abstraction;

  public class Rectangle extends Shapes {


		private int l;
		private int b;
		
		public Rectangle(int l,int b) {
			super();
			this.l = l;
			this.b = b;
		}
		public int getL() {
			return l;
		}
		public void setL(int l) {
			this.l = l;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
		void show() {
			System.out.println("Rectangle");
		}
		void CalArea() {
			System.out.println("Area of Rectangle:"+(l*b));
		}
	}


