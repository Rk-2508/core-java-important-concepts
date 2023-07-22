//Encapsulation

package oops_concept;

// Fields to calculate area
	class Area{
		int length;
		int breadth;
		
// Constructor to initialize values
	Area(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}
// Method to calculate area
	public void getArea() {
		int area = length*breadth;
		System.out.println("Area:"+ area);
	}
}
public class Main {
	public static void main(String[] args) {
		Area rectanle = new Area(2,16);
		rectanle.getArea();
	}
}
