
import java.util.*;

public class HashSetDemo {
	public static void main(String args[]){  
		  //Creating HashSet and adding elements  
		    HashSet<String> set = new LinkedHashSet();  
		           set.add("Sundar");    
		           set.add("Raj");    
		           set.add("Saran");   
		           set.add("Karthik");  
		           set.add("Krithik");
		           
		           //Iterator is an object that can be used to loop through collections
		           Iterator<String> i=set.iterator();
		           
		           //hasNext() method checks if the Scanner has another token in its input
		           while(i.hasNext())  
		           {  
		           System.out.println(i.next());  
		           }  
		 }  

}
