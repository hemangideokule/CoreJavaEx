import java.util.Scanner;
public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		s= sc.next();
		if(s.contains("a")||s.contains("i")||s.contains("o")||s.contains("u"))
		{
		System.out.println("Vowel");
		}
		else
		{System.out.println("consonant");}
		
		

	}

}
