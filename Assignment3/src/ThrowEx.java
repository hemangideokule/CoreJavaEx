/*
 Throw:
 Used in java exception, to explicitly throw an exception instance.
 Throw can be used in both checked and unchecked exception.
Throw can be used without throws.

Throws:
Used to declare an exception and throw it to the calling environment.
 Throws can be used in unchecked exception.
  Throws can not be used without throw. 
 */
public class ThrowEx {
	
	 static void method1()
	    {
	        try
	        {
	            throw new NullPointerException();
	        }
	        catch(NullPointerException e)
	        {
	            System.out.println("method1().");
	            throw e; 
	        }
	    }
	public static void main(String[] args) {
		try
		{
			method1();
		}
catch(NullPointerException e)
{
	System.out.println("Main method.");
}
	}

}
