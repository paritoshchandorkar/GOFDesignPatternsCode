package com.training.builder;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "Veg burger";
	}

	@Override
	public float price() {
		return 20.0f;
	}

}
