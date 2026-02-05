package com.tnsif.intro.MultiThreading;

public class running {

	
		public static void main(String[] args) {
			RunThread rd=new RunThread();
			Thread tt=new Thread(rd);
			tt.start();
		}

}
