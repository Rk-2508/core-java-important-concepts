/*
1.Hiding internal details and showing functionality is known as an abstraction.
For example, the phone call we don't know the internal processing.
2.There are two ways to achieve abstraction in java.
	1.Abstract class (0 to 100%)
	2.Interface (100%)
*/

//Example of abstract class 
package oops_concept;

abstract class Bank{
	abstract int getRateOfInterset();
}

class SBI extends Bank{
	int getRateOfInterset() {
		return 7;
	}
}

class PNB extends Bank{
	int getRateOfInterest() {
		return 8;
	}

	@Override
	int getRateOfInterset() {
		// TODO Auto-generated method stub
		return 8;
	}
}
public class TestBank {
	public static void main(String[] args) {
		Bank b;
		b = new SBI();
		System.out.println("Rate of interest is:"+b.getRateOfInterset()+" % ");
		b = new PNB();
		System.out.println("Rate of interest is:"+b.getRateOfInterset()+" % ");
	}
}
