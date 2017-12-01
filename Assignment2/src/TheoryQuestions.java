/*
1] Abstract Class can have the constructor definition although abstract class cannot be instantiated. But methods in abstract class can be implemented by the child class.
 
2] Yes we abstract class implements interface in Java. Interface always give 100% abstraction.
interface interface1
{
	int a=4, b=2;
public void add();
public void sub();

}
abstract class class1 implements interface1
{
	abstract void disp();
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

3] The class Abstract class can be abstract or final, not both. Final keyword will not allow to inherit that class. And abstract class must be inherited to use. So abstract class can’t be final in java.
4] Yes , abstract class can have static methods. As static methods can be called directly by the class name even if  the object is not being created of abstract class.
5] Abstract class can’t have any object and no method inside abstract class can be called directly.
6] No its not necessary to having only abstract method in abstract class. We can also have non-abstract methods also.
7] Difference b/w Interface and Abstract class:
Interface is implicitly abstract and doesn’t  have its  implementation. Abstract class members can have implementation in child class.
Interface’ members are public by default. Abstract class can have public,private,protected members.
Variables in interface are implicitly final. Abstract class can have both final or non-final variables.
For performing interface we use “implement” keyword, whereas  for abstract class we use “extend”.
Interface can only implement another interface only. Abstract class extends other classes and implements different interfaces also.
Interface support  multiple inheritance, abstract class does not.
8] In abstract class, we can choose what methods to be overrided in child class. It is not necessary to override all the methods of abstract class, if they are not implemented in abstract class they simply will not get used in the program.
But while using interface, we have to ovrride all the methods of interface, otherwise it will give error.
9] An abstract method  in a abstract class is a method that is declared without an implementation that is it only be declare in abstract class. The method which is to be abstract must be start with abstract keyword. i.e abstract method_name(); .This abstract method will have its definition or implementation in the subclass.  Thus it must be overridden in subclass.
10] Yes, abstract class contains main method in Java . Abstract class cannot be instantiated i.e we can’t create object of abstract class, but we can have static methods, including main() they don't need an object so calling them will not create any problem.
11] Static block is used for initializing the static variables.This block gets executed when the class is loaded. Static block called first during the execution . We can have multiple Static blocks in a class, which will execute as per  they have been written in the program.
12] Static block is used for initializing the static variables.This block gets executed when the class is loaded in the memory. A class can have multiple Static blocks, which will execute in the same sequence in which they have been written into the program.
13] Yes,we can overlaod static methods in java.  The methods will be called in the way they have been written.

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

14] Yes We can call static method in superclass from subclass.  Because static method will be called by the class name. Subclass_name.superclass_staticMethod(). But if subclass has same static method name as super static method, then subclass will called its static method rather super class static method.
class SuperDemo
{
public static void show()
{
System.out.println("superclass static method");
}
}
public class SubDemo extends SuperDemo
{
public static void show()
{
System.out.println("superclass static print method");
}


public static void main(String[] args) {
SubDemo.show();
//SubDemo.show();
}}

15] Static and Final:
Static variables are initialized only once, at the start of the execution.
A static method can access only static data.
A static nested class is just one which doesn't implicitly have a reference to an object  of the outer class.
A final class cannot be subclassed.i.e that class cant be inherited by other class.
A final method can't be overridden by subclasses.
A final variable can only be initialized once.

16] The covariant return type specifies that the return type may different in the same direction as the subclass.
it is possible to override method by changing the return type.

class A {}
class B extends A {}
class C
	{  A disp()
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

17] Enum in java is  nothing but a data type that contains fixed set of constants.
But it is s available from JDK 1.5.

public class EnumEx {

public enum Subject { java, c, html, css }

public static void main(String[] args) {
for (Subject s : Subject.values())
System.out.println(s);

}}
18] Super keyword is used to access the parent class variable with the parent class value. Super() method is used to invoke the parent constructor.

class person1{
void walk(){System.out.println("walking...");}
}
class person2 extends person1{
void walk()
{System.out.println("walking on road...");}
void run()
{System.out.println("running...");}

void work(){
super.walk();
run();
}
}

public class TestSuperDemo {

public static void main(String[] args)
{
person2 p= new person2();
p.work();
p.walk();

}}





*/