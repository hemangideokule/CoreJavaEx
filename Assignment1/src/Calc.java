import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
	char  c;
	int flag=1;
	do{
Scanner sc=new Scanner(System.in);
System.out.println("Enter 1st no");
a=sc.nextInt();
System.out.println("Enter 2nd no");
b=sc.nextInt();
System.out.println("Enter operator");
c= sc.next().charAt(0);
switch(c)
{
case '+':
	System.out.println("Addition="+(a+b));
	break;
case '-':
	System.out.println("Substarction="+(a-b));
	break;
case '*':
	System.out.println("Multiplication="+(a*b));
     break;
case '/':
	if(b!=0)
	{
		System.out.println("Division="+(a/b));
		flag=0;
		}
	else if(b==0)
	{
		System.out.println("2nd no cannot be 0... Try another");
		flag=1;
	//return;
	}
	
	break;
	
default:
		System.out.println("Wrong operator");
break;}
	}
while(flag==1);
	}


		

	}


