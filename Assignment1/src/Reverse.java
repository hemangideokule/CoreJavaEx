import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
String a,c=" ";
String  b;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter word");
a=sc.next();
n=a.length();
System.out.print("length="+n);

while(n>0)
{
	n--;
	b=Character.toString(charAt(n));

	c=c.toString().concat(b);
	System.out.print(c);

}

	}

	private static char charAt(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
