
import java.util.Scanner;

public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String a=null;
		String  b=null;
		System.out.println("Enter inputs for 1st array");
		a= sc.next();
		System.out.println("Enter inputs for 2nd array");
		b= sc.next();
		
		
		
int c= a.length();
int d=b.length();
System.out.println("a length="+c);
System.out.println("b length="+d);

if(c>d)
{
	System.out.println("a is larger");
	System.out.println(a);
	
	
	}
else
{System.out.println("b is larger");
System.out.println(b);

}
	}

}
