/*
UNCHECKED EXCEPTION
Not checked by compiler 
It is called as runtime because the problem in the program occurs at the time of final execution of the 
line of code.
 */

public class UncheckedDemo {

	public static void main(String[] args) {
		
		int x=90;
		int y=0;
		/*if(y==0);
		{
			System.out.println("second no cant be zero..!!");
		}
		*/
		int z =x/y;
		/*else
		{
		System.out.println("the output is "+z);
		}
		*/
		System.out.println("the output is "+z);
	}

}
