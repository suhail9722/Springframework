package com.nt.test;

public class NewInstanceTest1 {
	
	public static void main(String args[])throws Exception
	{
		Class c1=null,c2=null;
		Object obj1=null, obj2=null;
		
		//Load the Class(Test)
		c1=Class.forName(args[0]);
		
		//Create obj with the load class
		obj1=c1.newInstance();
		
		System.out.println(obj1.toString());
		System.out.println(".................");
		
		//Load the class (java.util.Date)
		c2=Class.forName(args[1]);
		
		//Create obj with the load class
		obj2=c2.newInstance();
		
		System.out.println(obj2.toString());
		System.out.println("...........");
		
	}

}
