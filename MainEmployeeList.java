package com.pace.collections.list;
import java.util.ArrayList;

public class MainEmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0;
		Employee kumar=new Employee(123,"kumar",1234.34f);
		Employee kunal=new Employee(167,"kunal",1894.34f);
		Employee sada=new Employee(198,"sada",1789.34f);
		ArrayList<Employee>empList=new ArrayList<Employee>();
		//add employee objects
		empList.add(kumar);
		empList.add(kunal);
		empList.add(sada);
		for(Employee emp:empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
			
		}
		for(Employee emp:empList) {
			float sr=emp.getSalary();
			sum+=sr;
		}
		System.out.println("Total Employee Salary:"+sum);
		
		

	}

}
