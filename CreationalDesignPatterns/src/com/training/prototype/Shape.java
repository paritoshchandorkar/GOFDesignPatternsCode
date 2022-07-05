package com.training.prototype;

public abstract class Shape implements Cloneable{
	
	public Object clone() {
	      Object clone = null;     
	      try {
	         clone = super.clone();         
	      } catch (CloneNotSupportedException e) {
	         e.printStackTrace();
	      }  
	      return clone;
	   }
	
	abstract void draw();
}
