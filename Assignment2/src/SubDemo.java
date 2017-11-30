class SuperDemo
{
public static void show()
{
	System.out.println("superclass static method");
}
/*public static void print()
{
	System.out.println("superclass static print method");
}*/
}
public class SubDemo extends SuperDemo
{
	public static void print()
	{
		System.out.println("superclass static print method");
	}

	
	public static void main(String[] args) {
SubDemo.show();
//SuperDemo.print();
//SubDemo.show();
//SubDemo.print();
	}

}
