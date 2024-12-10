import java.lang.*;
public class TypeCast
{
	public static void main(String []args)
	{
		int a = 5;
		double b = 0;
		b = a;//implicit type casting
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		int c = 0;
		double d = 5.3;
		c = (int) d;
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		
	}
}