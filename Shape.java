/*1. Create a class Shape with attributes length and width. 
 * Write a method boolean isSquare() if both sides are equal. 
 * If not, throw a custom RuntimeException (say NotASquareException). 
 * The main() method should print out this exception message.*/

package target_assn;

import java.util.Scanner;

class NotASquareException extends Exception{}

public class Shape {
	static int l,b;
	static boolean isSquare()
	{
		Scanner sc=new Scanner(System.in);
    	System.out.println("Enter length and breadth(integer value):");
    	l=sc.nextInt();
    	b=sc.nextInt();
    	if(l==b)
    	{
    		return true;
    	}
    	else
    		return false;
	}
	static void notsquare() throws NotASquareException
    {
        
        	throw new NotASquareException();
    }
    public static void main(String args[])
    {
    	
        try
        {
            if(isSquare())
            	System.out.println("It is a square.");
            else
            	notsquare();
        }
        catch(NotASquareException e)
        {
            System.out.println("It is NOT a square.");
        }
    }
}


/*
o/p-1
Enter length and breadth(integer value):
4
4
It is a square.

o/p-2
Enter length and breadth(integer value):
4
6
It is NOT a square.
*/
