package com.tnsif.intro;

public class StudentMain {

	public static void main(String[] args) {
		 Students s = new Students();

        s.getsid(101);
        s.getsname("Chaitanya");
        s.getsmarks(100);
        System.out.println("ID: " + s.setsid());
        System.out.println("Name: " + s.setsname());
        System.out.println("Marks:"+s.setsmarks());   

	}

}
