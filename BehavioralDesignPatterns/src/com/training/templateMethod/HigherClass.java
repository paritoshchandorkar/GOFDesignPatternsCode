package com.training.templateMethod;

public abstract class HigherClass {
	public void run(){
		amethod();
		bmethod();
		cmethod();
	}
	
	public abstract void amethod();
	public abstract void bmethod();
	
	public void cmethod(){
		System.out.println("HigherClass:Executing cmethod");
	}
	}
