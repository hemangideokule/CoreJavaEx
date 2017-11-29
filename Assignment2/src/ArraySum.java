import java.util.Scanner;
public class ArraySum 
	{
			public static void main(String[] args) {
				int n,sum=0;
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter array no");
				n=sc.nextInt();
				int array1 []= new int [n];
				for (int a=0; a<n;a++)
				{
				 array1[a]=sc.nextInt();
				}
				for(int i=0; i<n;i++)
				{
					
					sum=sum+array1[i];
				}
			System.out.println("sum="+sum);
			}
	
	}
