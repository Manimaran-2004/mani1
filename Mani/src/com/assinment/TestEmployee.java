package com.assinment;
import com.assinment.*;
public class TestEmployee {
	public static void main(String[] args) {
		Manager manager=new Manager("Akash R", 101,8500,10);
		System.out.println("Manager Details");
		manager.displaydetails();
		System.out.println();
		Developer developer=new Developer("Akash B", 102,7500,"java");
		System.out.println("Developer Details");
		developer.displaydetails();
	}

}
	


