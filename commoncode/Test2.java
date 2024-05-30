package com.commoncode;
 
 
interface An{
	default void show() {
		System.out.println("A");
	}
}
interface Bn{
	default void show() {
		System.out.println("B");
	}
}
class C implements An,Bn{
 
	@Override
	public void show() {
		// TODO Auto-generated method stub
		An.super.show();
	}
	
}
 
public class Test2 {
 
	public static void main(String[] args) {
 
C c=new C();
c.show();
 
	}
 
}
 