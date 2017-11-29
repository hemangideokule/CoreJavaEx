import java.util.Scanner;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r, c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row and col");
		r = sc.nextInt();
		c = sc.nextInt();
		int x[][] = new int[r][c];
		int newArr[][]=new int[r][c];
		System.out.println("Enter input");
		for (int a = 0; a < r; a++) {
			for (int b = 0; b < c; b++) {
				x[a][b] = sc.nextInt();
				//newArr[a][b]=x[a][b];
			}

		}
		System.out.println("Your 1st array");
		for (int a = 0; a < r; a++) {
			for (int b = 0; b < c; b++) {
				System.out.print(" " + x[a][b]);
				
			}
			System.out.println();

		}
		System.out.println("Second Array");

	}

}
