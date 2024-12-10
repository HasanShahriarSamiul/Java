import java.lang.*;
import newp.*;

public class Start
{
	public static void main(String args[])
	{
		Demo d1 = new Demo();
		Demo d2 = new Demo();
		
		//d1.a = 10;//cannot access private
		d1.setA(10);
		d1.b = 15;
		//d1.c = 10.5;//c -> protected, cannot be accessed from outside package or withour inheritance
		d1.s = "Hello";//->package private, cannot be accessed from outside package
		//d1.x = 100;//cannot access private
		d1.setX(100);
		
		System.out.println("**********d1 details*********");
		d1.display();
		System.out.println("**********d2 details*********");
		d2.display();
		
		Demo d3 = new Demo();
		d3.setX(200);
		System.out.println("**********d1 details*********");
		d1.display();
		System.out.println("**********d2 details*********");
		d2.display();
		System.out.println("**********d3 details*********");
		d3.display();
	}
}