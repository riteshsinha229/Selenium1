package au_31;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashSetConcept {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Ravi");
		set.add("Ajay");
		set.add("Ravi");
		
		set.remove("Ravi");
		
		Iterator<String> itr = set.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());

			}
		Hashtable<Integer, Integer> h = new Hashtable<Integer, Integer>();
		h.put(1, 200);
		h.put(2, 300);
		System.out.println(h.get(2));
		for(Map.Entry m: h.entrySet())
		{
			System.out.println(m.getKey()+ "" +m.getValue());
		}
		
		
		

}
}
