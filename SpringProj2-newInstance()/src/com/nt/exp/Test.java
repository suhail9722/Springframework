package com.nt.exp;

public class Test {
     
	int x,y;

	public Test()
	{
		System.out.println("Test.Test():: 0-Param-Constructor");
	}
	
	public Test(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Test.Test() :: 2- Param-Constructor");
	}
	
	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}

}
