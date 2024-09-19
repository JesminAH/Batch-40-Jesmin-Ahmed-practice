package com.practice;

public class PracticeMethod {

	public void getVoidMethod() {
		System.out.println("This is a non-static void method.");
		
	}
	public static void main(String[] args) {
		
		PracticeMethod obj=new PracticeMethod();
		obj.getVoidMethod();
	}
}
