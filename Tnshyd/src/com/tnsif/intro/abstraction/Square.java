package com.tnsif.intro.abstraction;

   	public class Square extends Shapes {
		private int s;
		Square (int s){
			this.s=s; 
		}
		
		public int getS() {
			return s;
		}


		public void setS(int s) {
			this.s = s;
		}
		void show() {
			System.out.println("Square");
		}
		void CalArea() {
			System.out.println("Area of Square:"+(s*s));
		}
	}
	


