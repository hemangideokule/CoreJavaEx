interface interface1
{
	int a=4, b=2;
public void add();
public void sub();


}

abstract class class1 implements interface1
{
	abstract void disp();
	//abstract void disp1();
	
}

public class InterfaceDemo implements interface1 {
	public void disp()
	{
		System.out.println("abstract method");
	}
	public void add()
	{
		System.out.println("addition="+(a+b));
	}
	public void sub()
	{
		System.out.println("substraction="+(a-b));
	}
	public static void main(String[] args)
	{
      InterfaceDemo id= new InterfaceDemo();
     id.disp();
     id.add();
     id.sub();
     


	}

}
