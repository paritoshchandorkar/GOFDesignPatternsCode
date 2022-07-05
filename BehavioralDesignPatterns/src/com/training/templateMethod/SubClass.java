package com.training.templateMethod;

public class SubClass extends HigherClass {

	@Override
	public void amethod() {
		System.out.println("SubClass:Executing amethod");
	}

	@Override
	public void bmethod() {
		System.out.println("SubClass:Executing bmethod");
	}

}
