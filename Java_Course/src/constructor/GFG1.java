package constructor;

class Geeks{
	// data member of the class
	String name;
	int id;
	Geeks(String name, int id){
		this.name= name;
		this.id=id;
	}
}
public class GFG1 {
	public static void main(String[] args)
    {
        // This would invoke the parameterized constructor.
        Geeks geek1 = new Geeks("avinash", 68);
        System.out.println("GeekName :" + geek1.name  + " and GeekId :" + geek1.id);
    }
}
