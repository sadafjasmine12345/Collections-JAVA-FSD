package com.pace.collections.set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String>citySet=new TreeSet<String>();//gives sorted set
		citySet.add("Hyderabad");
		citySet.add("Pune");
		citySet.add("Bengaluru");
		citySet.add("Hyderabad");
		
		for(String city:citySet) {
			System.out.println(city);
		}

	}

}
