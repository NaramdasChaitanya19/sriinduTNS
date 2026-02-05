package com.tnsif.intro.MultiThreading;

public class Threads {



		public static void main(String[] args) throws InterruptedException {
			for(int i=0;i<5;i++) {
				mutlithread mt=new mutlithread();
				mt.start();
				Thread.sleep(5000);
			}
		}

	}


