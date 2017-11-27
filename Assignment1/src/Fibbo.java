
public class Fibbo {
	
	
	public void show()
	{int a=0;
	int b=1;
	//int c;
	System.out.print(" "+a);
	System.out.print(" "+b);
		for(int i=0;i<5; i++)
		{
			
			a=a+b;
			System.out.print(" "+a);
			b=a+b;
			System.out.print(" "+b);
			
			
			
			
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Fibbo f= new Fibbo();
f.show();
	}

}
