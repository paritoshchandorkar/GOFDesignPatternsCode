package com.training.prototype;

public class PrototypePatternDemo {

	public static void main(String[] args) {
		Circle circle =new Circle();
		Rectangle rectangle =new Rectangle();
		Square square =new Square();
		
		((Shape)circle.clone()).draw();
		((Shape)rectangle.clone()).draw();
		((Shape)square.clone()).draw();
		
	}

}
