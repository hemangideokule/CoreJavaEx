import java.util.Scanner;
public class DeleteElement {

	public static void main(String[] args) 
	{
		int n,a,b,i, input;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter size");
		n=sc.nextInt();
		int array1 []= new int [n];
		System.out.println("Enter input:");
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
		//System.out.println("which..??");
		System.out.println("How you want to remove.");
		System.out.println();
		System.out.println("1.By element");
		System.out.println("2.By position");
		System.out.println();
		System.out.println("pls choose 1 or 2?");
		int no=sc.nextInt();
		if(no==1)
		{
			System.out.println("which element to be remove..??");
			input=sc.nextInt();
			for ( i=0; i<n;i++)
			{
				if(array1[i]==input)
				{ 
					if(i==0)
					{
					array1[0]=0;
					}
			    
				else
				
					array1[i]=array1[i-1];
				}
			}
		}
		if(no==2)
		{
			System.out.println("which position to be remove..??");
			
			input=sc.nextInt();
			for ( i=0; i<n;i++)
			{
				if(i==input)
				{ 
					if(i==0)
					{
					array1[0]=0;
					}
			    
				else
				
					array1[i]=array1[i-1];
				}
			}
		}
		
		for ( b=0; b<n;b++)
		{
		System.out.print( array1[b]);
		}	
		
	}

}
