package com.tnsif.intro.consumer_producer;

public class ThreadDemo {
	int i;
	boolean flag=false;
	
	synchronized void deliver(int i) {
		if(flag)
			try {
				wait();
	        }catch(Exception e) {
	        	System.out.println(e);
	        }
		this.i=i;
		flag=true;
		System.out.println("The msg is delivered"+i);
		notify();
	
	}
	synchronized int receiver()
	{
		if(!flag)
			try {
				wait();
	        }catch(Exception e) {
	        	System.out.println(e);
	        }
		System.out.println("The msg is received"+i);
		flag=false;
		notify();
		return i;
		
	}

}
