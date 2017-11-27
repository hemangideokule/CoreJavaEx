
public class Rhombus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		int j;
		//int n=4;
		for(i=1; i<8;i++)
		{
		  int space=3;
		
		    if(i<=4)
			{
		    	
		    	for(i=space; i>0; i--)
			     {
		    		  System.out.print(" ");
					     
			     }
				for(j=1; j<=(2*i-1); j++)
			     {
				   System.out.print("*");
			     }
				
				System.out.println();
				//n--;
				space--;
		
			}

		    if(i>4)
			{
		    	
		    	for(i=space; i>0; i--)
			     {
		    		  System.out.print(" ");
					     
			     }
		    	for(j=1; j<=(2*(i-j)-1); j++)
			     {
				   System.out.print("*");
			     }
		    	System.out.println();
		    	//n++;
		    	space++;
		     }
		    
		}
	
		
		
		}
	
	}

