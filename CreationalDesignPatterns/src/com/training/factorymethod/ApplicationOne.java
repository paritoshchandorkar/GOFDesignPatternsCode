package com.training.factorymethod;

public class ApplicationOne implements Framework {

	@Override
	public Product makeProduct() {
	    return new ProductOne();
	}

}
