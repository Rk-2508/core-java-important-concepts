// Compile-time Polymorphism - It is achieved by method overloading.
// Method overloading
package oops_concept;

class Helper{
	static int Multiply(int a, int b) {
		return a*b;
	}
	static double Multiply(double a, double b) {
		return a*b;
	}
}
public class GFG {
	public static void main(String[] args) {
		System.out.println(Helper.Multiply(2,4));
		System.out.println(Helper.Multiply(5.5,6.3));
	}
}
/*
In java Polymorphism is divided into two parts 
1.Complile-type Polymorphism
2.Runtime Polymorphism
*/