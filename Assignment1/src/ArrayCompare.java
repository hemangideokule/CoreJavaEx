import java.util.Arrays;

public class ArrayCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[] a={"f","e","d","c","b","a"};
String[] b={"f","e","d","c","b","a","j","h","r"};
int c= a.length;
int d=b.length;
System.out.println("a length="+c);
System.out.println("b length="+d);

if(c>d)
{
	System.out.println("a is larger");
	System.out.println(Arrays.toString(a));
	
	
	}
else
{System.out.println("b is larger");
System.out.println(Arrays.toString(b));

}
	}

}
