
public class StaticOverload {

	public static void show()
	{
		System.out.println("1st static method");
	}
	
	public static void show(int a)
	{
		System.out.println("2nd static method"+ " "+ "a="+a);
	}
	public static void show(int a, String b)
	{
		System.out.println("3rd static method"+ " "+ "a="+a+" "+ "b="+ b);
	}
	public static void main(String[] args) {
         
		 StaticOverload.show();
		 StaticOverload.show(10);
		 StaticOverload.show(20, "hello");
	}

}
