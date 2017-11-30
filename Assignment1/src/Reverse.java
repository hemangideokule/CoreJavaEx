import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		String a;
		String c=" ";
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
		String d= Character.toString(b);
			c=c.concat(d);
			
			n--;

		}
		System.out.println(c);

	}

	private static char charAt(int n) {
		// TODO Auto-generated method stub
		return 0;
	}

}
