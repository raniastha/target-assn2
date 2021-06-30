/*3. Create a class with two methods method1() and method2(). 
 * Method2() should throw a NullPointerException. 
 * Call method2() from method1(). 
 * method1() should catch the specific exception and 
 * transform this into a Custom Exception and throw the custom exception created back to main() method. 
 * Main method should print out the message of the caught exception*/

package target_assn;

class CustomException extends Exception{}

public class TwoMethod {
	
	static void method1() throws CustomException{
		try{
			method2();
		}
		catch(Exception e) {
			throw new CustomException();
		}
	}
	static void method2() {
		String ptr = null;
        try
        {
            if (ptr.equals("something"))
                System.out.print("correct");
            else 
                System.out.print("not correct");
        }
        catch(NullPointerException e)
        {
        	throw e;
        }
	}
	
	public static void main(String args[]) {
		try {
			method1();
		}
		catch(CustomException e){
			System.out.println("Exception caught in main");
		}
	}

}
