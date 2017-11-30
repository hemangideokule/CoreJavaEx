import java.util.Scanner;

public class ReverseArray {

	public static void main(String[] args) {
		int a,b, n,i,j = 0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array size");
		n=sc.nextInt();
		
		int array1 []= new int [n];
		
		System.out.println("Enter values");
		for ( a=0; a<n;a++)
		{
		 array1[a]=sc.nextInt();
		}
		
		System.out.println("Your array:");
		for ( b=0; b<n;b++)
		{
		System.out.print( array1[b]);
		}	
		System.out.println();
		//System.out.println("Your Reverse array:");
		for ( a=0; a<n;a++)
		{
			for ( b=n-1;  b>0;b--)
			{
				int temp= array1[a];
				array1[a]=array1[b];
				array1[b]=temp;
			}
		}
		 /*for ( a = 0, b =n - 1; a < b; a++, b--) {
	            int temp = array1[a];
	            array1[a] = array1[b];
	            array1[b] = temp;
	        }*/
		System.out.println("Your reverse array:");
		for ( a=0; a<n;a++)
		{
		System.out.print(array1[a]);
		}	
		
	}

}
