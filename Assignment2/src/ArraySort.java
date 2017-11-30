import java.util.Scanner;
import java.util.Arrays;
public class ArraySort {

	public static void main(String[] args) {
		int n,a,b;
		String str;
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
		System.out.println("Enter string");
		str=sc.next();
		System.out.println("String array : "+str);
		System.out.println();
		
		
	    //Arrays.sort((int)str);
	    //System.out.println("Sorted string array : "+Arrays.toString(str));
	    
	}

}
