package com.pace.collections.list;

import java.util.ArrayList;

public class TechListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>techList=new ArrayList<String>();
		techList.add("html");
		techList.add("Python");
		techList.add("Dot Net");
		System.out.println("Original Tech List:");
		for(String technology:techList) {
			System.out.println(technology);
		}
		techList.set(2, "Angular");//for updation use setter
		System.out.println("Tech List after updation:");
		for(String technology:techList) {
			System.out.println(technology);
		}
		techList.set(1, "Html");
		System.out.println("Tech List after updation:");
		for(String technology:techList) {
			System.out.println(technology);
		}
		
		String langStr="Angular";
		techList.set(2, langStr);
		System.out.println("Tech List after updation:");
		for(String technology:techList) {
			System.out.println(technology);
		}
		
		
		
		
		


	}

}
