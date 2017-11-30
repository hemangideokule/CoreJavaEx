abstract class AbstractEx
	{
	int a=30,b=1;
	abstract public void disp();
	public static void abc()
	{
		System.out.println("hellloo");
	}
	/*AbstractEx()
	{System.out.println("hiiiii");}
	public void disp()
	{
	System.out.println("A ="+a);
	System.out.println("B ="+b);
	}*/
	}

class AbstractEx1 extends AbstractEx
	{
		@Override
		public void disp()
		{
			System.out.println("Addition="+(a+b));
			
	}
	}
public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbstractEx1 ab=new AbstractEx1();
		ab.disp();
		ab.abc();
		//ab= new AbstractEx();
	

	}

}
