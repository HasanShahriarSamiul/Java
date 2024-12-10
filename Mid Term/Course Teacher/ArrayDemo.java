import java.lang.*;
public class ArrayDemo
{
	public static void main(String[] args)
	{
		int arr1[] = new int[3];
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		//arr1[3] = 40;//not allowed
		System.out.println("*****for loop*****");
		for(int i = 0; i<arr1.length; i++)
		{
			System.out.println("arr1["+i+"]: "+arr1[i]);
		}
		System.out.println("*****while loop*****");
		int j = 0;
		while(j<arr1.length)
		{
			System.out.println("arr1["+j+"]: "+arr1[j]);
			j++;
		}
		System.out.println("*****do-while loop*****");
		int k = 0;
		do
		{
			System.out.println("arr1["+k+"]: "+arr1[k]);
			k++;
		}while(k<arr1.length);
		
		int arr2[];
		int size = arr1[2]/arr1[0];
		arr2 = new int[size];
		for(int i = 0; i<arr2.length; i++)
		{
			System.out.println("arr2["+i+"]: "+arr2[i]);
		}
		int arr3[] = new int[]{15, 25, 35, 45};
		for(int i = 0; i<arr3.length; i++)
		{
			System.out.println("arr3["+i+"]: "+arr3[i]);
		}
		int arr4[] = {100, 200, 300};
		for(int i = 0; i<arr4.length; i++)
		{
			System.out.println("arr4["+i+"]: "+arr4[i]);
		}
		
		System.out.println("Output Tracing");
		int arr5[] = new int[]{5, 7, 10, 15, 18};
		System.out.println(arr5.length);//5
		System.out.println(arr5[7-3]+arr5[2-2]+5);//28
		int c = arr5.length;
		arr5[3] = arr5[c-1] + arr5[arr5.length-2];
		System.out.println(arr5[3]);
		
	}
}