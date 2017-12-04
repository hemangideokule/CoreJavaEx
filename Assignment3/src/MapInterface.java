/*
Map Interface:
It is separate interface from collection package, but falls under framework of collection because it stores series or collection of data.
 It is implemented by 2 main classes:
a) HashMap
b) LinkedHashMap

*/
import java.util.*;
public class MapInterface {

	public static void main(String[] args) {
//this does not display op in a specific way..
			  Map<String, Integer> map=new HashMap<String,Integer>();  
			  
			  map.put("AgeC",23); 
			  map.put("AgeA",21);  
			  map.put("AgeB",22);  
			  
			  for(Map.Entry m:map.entrySet())
			  {  
			   System.out.println(m.getKey()+" "+m.getValue());  
			   
	}

}
}
