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

	}

}
