package kostana.maksic;
import java.util.*;  
public class Main {

	public static void main(String[] args) {
		 TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(100,"Cana");    
	      map.put(102,"Daca");    
	      map.put(101,"Cica");    
	      map.put(103,"Maca");    
	        
	      
	      System.out.println(map.tailMap(101));
	      for(Map.Entry m:map.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }    
	 }  
	}  