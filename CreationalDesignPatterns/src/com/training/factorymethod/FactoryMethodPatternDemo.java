package com.training.factorymethod;

public class FactoryMethodPatternDemo {

	public static void main(String[] args) {
		Framework frameworkOne =new ApplicationOne();
		frameworkOne.makeProduct().work();
		
		Framework  frameworkTwo =new ApplicationTwo();
		frameworkTwo.makeProduct().work();
	}

}
