//Inheritance example
package oops_concept;

class Employee {
int salary=4000;
}
public class Programmer extends Employee{
	int bonus=1000;
	public static void main(String[] args) {
		Programmer p = new Programmer();
		System.out.println("Programmer salary is:"+p.salary);
		System.out.println("Bonus of Programme is:"+p.bonus);
	}
}

