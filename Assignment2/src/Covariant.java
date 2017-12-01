class A {}
class B extends A {}
 
class C
{
    A disp()
    {
        System.out.println("display() from class c");
        return new A();
    }
}
 
class D extends C
{
    B disp()
    {
        System.out.println("display() from class d");
        return new B();
       
    }
}
public class Covariant {

	public static void main(String[] args) {
		C c = new C();
	       c.disp();
	      
	 
	       D d = new D();
	       d.disp();
	}

}
