package com.tnsif.intro.Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class personDemo {

	public static void main(String[] args) {

		List <person>ob = new ArrayList<person>();
		person p = new person("Ashwitha", "hyd");
		ob.add(p);
		p = new person("Mythri", "delhi");
		ob.add(p);
		p = new person("Sri", "banglore");
		ob.add(p);
		p = new person("Jhon", "banglore");
		ob.add(p);
		System.out.println(ob);
		System.out.println("sorting names");
		Collections.sort(ob,new sortByName());
		System.out.println(ob);
		System.out.println("sorting city");
		Collections.sort(ob,new sortByCity());
		System.out.println(ob);

	}


	}


