package com.commoncode;
 
 
class Base{
	static String s="Super class";
public	Base(){
		System.out.printf("1");
	}
}
 
public class Derived extends Base {
	public Derived() {
		super(); //1 2
		System.out.printf("2");
			
	}
	
	public static void main(String[] args) {
		Derived d=new Derived();
	}
}