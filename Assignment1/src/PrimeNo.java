import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		
int a;
int count=0;
Scanner sc= new Scanner(System.in);

System.out.println("Enter number");
a= sc.nextInt();
for(int i=1;  i<a;  i++)
{
if( a%i==0)
{
	
	{
	count++;
	}
}

}
if(count==1)
{System.out.println("Prime Number");}
else
{
System.out.println("not a Prime Number");

}	
}

}
