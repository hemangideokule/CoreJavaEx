import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		int sum=0,b,c=1,n,t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no");
		n=sc.nextInt();
	t=n;
		while(n>=1)
		{
			b=n%10;
			//c=n/10;
			n=n/10;
			sum=sum+(b*b*b);
		//	n=c;
			
		}
		
	if(sum==t)
	{System.out.print("Armstrong");}
	else{System.out.print("Not an Armstrong");}
	
	}

}
