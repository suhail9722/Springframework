package com.nt.test;

import java.lang.reflect.Constructor;

public class NewInstanceTest2 {

	public static void main(String[] args)throws Exception
	{
		Class c1=null,c2=null;
		Constructor cons1[]=null,cons2[]=null;
		Object obj1=null,obj2=null;
		
		//Load Test Class (Test)
		c1=Class.forName(args[0]);
		
		//get All Constructors
		cons1=c1.getDeclaredConstructors();
		
		//Create the object of loaded Class
		obj1=cons1[1].newInstance(10,20);
		System.out.println(obj1.toString());
		
		System.out.println(".............");
		//Load Test Class (java.util.Date)
		c2=Class.forName(args[1]);
		
		//get All constructor
		cons2=c2.getDeclaredConstructors();
		
		//Create the object of loaded Class
         obj2=cons2[2].newInstance(40,50,60);
         System.out.println(obj2.toString());
         
	}

}
