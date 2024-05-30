package com.commoncode;
 
class FirstClass{
	public  FirstClass()
	{super();
		System.out.println("1");
	}
}
class SecondClass extends FirstClass{
	public  SecondClass()
	{
		super();
		System.out.println("2");
	}
}
class ThirdClass extends SecondClass{
	public  ThirdClass()
	{
		System.out.println("3");
	}
}
public class Main {
 
	public static void main(String[] args) {
		ThirdClass t=new ThirdClass();
 
	}
 
}
 