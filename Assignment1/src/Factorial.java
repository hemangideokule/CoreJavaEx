import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, fact = 1;
		Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 5; j++) {
			System.out.print("Enter number:");
			a = sc.nextInt();
			for (int i = 1; i <= a; i++) {

				fact = i * fact;

			}
			System.out.println("factorial=" + fact);
			fact = 1;
		}

	}

}
