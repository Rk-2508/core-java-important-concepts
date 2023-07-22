// Runtime-Polymorphism - It is achieved by method overriding
// Method overriding
package oops_concept;

// Creating a parent class
 class Bike2 {

// defining a method
	void run() {
		System.out.println("Vehicle is running");
	}
}

// Creating a child class
 public class Vehicle extends Bike2{
	
// defining the same method as in the parent class
	void run() {
		System.out.println("Bike is running safely");
	}
	public static void main(String[] args) {
		Bike2 obj = new Bike2();
		obj.run();
	}
}