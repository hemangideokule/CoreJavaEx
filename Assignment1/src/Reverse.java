import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
String a,c;
char b;
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter word");
a=sc.next();
n=a.length();
System.out.print("length="+n);

while(n>0)
{
	
	b=a.toString().charAt(n-1);

	b.toString().concat(a);
	System.out.print(b);

}

	}

}
