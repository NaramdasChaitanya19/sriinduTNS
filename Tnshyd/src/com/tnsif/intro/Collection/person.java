package com.tnsif.intro.Collection;
import java.util.Comparator;

public class person {
	String name;
	String city;


	@Override
	public String toString() {
		return "Person [name=" + name + ", city=" + city + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public person(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
}
class sortByName implements Comparator<person>{

	@Override
	public int compare(person o1, person o2) {

		return o1.getName().compareTo(o2.getName());
	}

}
class sortByCity implements Comparator<person>{

	@Override
	public int compare(person o1, person o2) {

		return o1.getCity().compareTo(o2.getCity());
	}
}
