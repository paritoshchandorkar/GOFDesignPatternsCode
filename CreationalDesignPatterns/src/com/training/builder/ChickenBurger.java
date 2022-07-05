package com.training.builder;

public class ChickenBurger extends Burger {
  
	@Override
	public  String name(){
		return "ChickenBurger";
	}
	
	@Override
	public float price() {
		return 25.0f;
	}
}
