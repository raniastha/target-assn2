/*2. Generate an ArrayIndexOutOfBoundsExceptions and use catch and 
 * finally blocks to handle the exception and reset the index value*/

package target_assn;

import java.util.Scanner;

public class TryCatchException {
	public static void main(String args[]) {
		System.out.println("Enter the size of array:");
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter "+size+" integers:");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
		}
		try {
			for(int i=0;i<=size;i++)
			{
				int j=i+1;
				System.out.println("element "+ j +" = " + arr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
	         System.out.println("Array is out of Bounds - "+e);
		}
		finally {
			System.out.println("Let's end...");
		}
	     
	}
}


/*
o/p

Enter the size of array:
5
Enter 5 integers:
10
3
2
6
7
element 1 = 10
element 2 = 3
element 3 = 2
element 4 = 6
element 5 = 7
Array is out of Bounds - java.lang.ArrayIndexOutOfBoundsException: 5
Let's end...
*/
