
public class demo1
{
    public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i;
		int j;
		int space=3;
		int k;
		for(i=1; i<8;i++)
		{
		
		    if(i<=4)
			{
		    	
		    	for( k=space; k>0; k--)
			     {
		    		  System.out.print(" ");
					     
			     }
		    	space--;
				for(j=1; j<=(2*i-1); j++)
			     {
				   System.out.print("*");
			     }
				
				System.out.println();
				if(space==-1)
					space=1;
		
			}	
		     
		    if(i>4)
			{
		    	
		    	
		    	for( k=space; k>0; k--)
			     {
		    		  System.out.print(" ");
					     
			     }	
		    	space++;
				for(j=1; j<=(2*(8-i)-1); j++)
			     {
				   System.out.print("*");
			     }
				
				System.out.println();
			
		
			}	
		    
        }
		
	}

}
