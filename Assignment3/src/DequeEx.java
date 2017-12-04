/* 
 Deque:
 The java.util.Deque interface is a subtype of the java.util.Queue interface.
 It can contain duplicate values.
 It can only be instantiated by ArrayDeque becauese Deque itself is abstract.
 
 */

import java.util.*;
public class DequeEx {

	public static void main(String[] args)
	{

	Deque <Double> obj = new ArrayDeque <Double>();
	obj.add(1806.3);
	obj.add(5462.3);
	obj.add(10245.2);
	obj.add(10245.2);
	obj.add(45786.22);

	Iterator itr = obj.iterator();
	while(itr.hasNext())
	{
	System.out.println(itr.next());
	}
	System.out.println("The top element is :"+obj.peek());


	System.out.println();
	obj.remove();
	
	Iterator itr2 = obj.iterator();
	while(itr2.hasNext())
	{
	System.out.println(itr2.next());
	}
	System.out.println("The top element is :"+obj.peek());
	
	
	Iterator reverse = obj.descendingIterator();
	System.out.println("Reverse Iterator");
    while (reverse.hasNext())
    {
 System.out.println( reverse.next());
	}
}
}