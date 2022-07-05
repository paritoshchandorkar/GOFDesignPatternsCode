package com.training.singleton;

public final class Singleton {

	/**
	* The Singleton Constructor. * Note that it is private!
	* No client can instantiate a Singleton object!
	*/
	private Singleton() {}
	
	// The private reference to the one and only instance.
		private static  Singleton uniqueInstance = null;
		// An instance attribute.
		private int data = 0;
		
		public static Singleton getInstance() {
			if(uniqueInstance == null) {
				synchronized(Singleton.class) {
					if(uniqueInstance == null) {
						uniqueInstance = new Singleton();
					}
				}
			}
			
			return uniqueInstance;
		}
		
		private int getData() {
			return data;
		}
		private void setData(int i) {
			this.data = i;
		}
		
		public static void main(String args[]) {
			// Get a reference to the single instance of Singleton.
			Singleton s = Singleton.getInstance();
			// Set the data value.
			s.setData(34);
			System.out.println("First reference: " + s);
			System.out.println("Singleton data value is: " +
			s.getData());
			// Get another reference to the Singleton.
			// Is it the same object?
			s = null;
			s = Singleton.getInstance();
			System.out.println("\nSecond reference: " + s);
			System.out.println("Singleton data value is: " +
			s.getData());
			}
}
