package newp;

import java.lang.*;
public class Demo
{
	private int a; //private instance var
	public int b; //public instance var
	protected double c; //protected instance var
	String s; //package-private instance var
	private static int x; //private class(static) var
	
	public void setA(int a) //a - local var
	{
		this.a = a;
	}
	public static void setX(int y) //y - local var
	{
		x = y;
	}
	
	public void display()
	{
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		System.out.println("c: "+c);
		System.out.println("s: "+s);
		System.out.println("x: "+x);
	}
}