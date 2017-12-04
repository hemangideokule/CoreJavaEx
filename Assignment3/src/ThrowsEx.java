
public class ThrowsEx {

	static void check() throws ArithmeticException
	 {
	  System.out.println("Check Function..!!");
	  throw new ArithmeticException("arithmetic ex");
	 }

	 public static void main(String args[])
	 {
	  try
	  {
	   check();
	  }
	  catch(ArithmeticException e)
	  {
	   System.out.println( e);
	  }
	 }
	}

