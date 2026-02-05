package com.tnsif.intro.Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class collect {

	public static void main(String[] args) {

		ArrayList al=new ArrayList();
		al.add(101);
		al.add("Hi");
		al.add(234.5f);
		al.add('c');
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		
		
		
		LinkedList li=new LinkedList();
		li.addFirst(678);
		li.addFirst("TNS");
		li.addFirst(0.23f);
		li.addLast('H');
		li.addLast(129);

		System.out.println(li);
		li.removeFirst();
		System.out.println(li);
		

	}



	}


