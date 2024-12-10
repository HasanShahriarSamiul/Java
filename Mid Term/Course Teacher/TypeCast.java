import java.lang.*;
public class TypeCast
{
	public static void main(String []args)
	{
		int a = 5;
		double b = 0; 
		b = a; //implicit type casting
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		
		int c = 0;
		double d = 5.3;
		c = (int) d; //explicit type casting
		System.out.println("c: "+c);
		System.out.println("d: "+d);
		
		//not type-casting
		String s = "5";
		int e = Integer.parseInt(s);//allowed
		System.out.println(e*e);
		
		String s1 = "five";
		int f = Integer.parseInt(s1);//not allowed
		System.out.println(f*f);
	}
}