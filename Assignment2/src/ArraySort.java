import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		int n,a,b;
		//String str=null;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter size");
		n=sc.nextInt();
		int array1 []= new int [n];
		System.out.println("Enter input:");
		for ( a=0; a<n;a++)
		{
		 array1[a]=sc.nextInt();
		}
		System.out.println("Integer array:");
		for ( b=0; b<n;b++)
		{
		System.out.print( array1[b]);
		}	
		System.out.println();
		Arrays.sort(array1);
	    System.out.println("Sorted numeric array : "+Arrays.toString(array1));
		System.out.println();
		
		int str;
		System.out.println("Enter size of string array : ");
		str=sc.nextInt();
		String[] array2 = new String[str] ;
		System.out.println("Enter strings:");
		for (int i =0 ; i < str;i++){

            array2[i] = sc.next();
        }
		 
		Arrays.sort(array2);
	    System.out.println("Sorted string array : "+Arrays.toString(array2));
	    
	}

}
