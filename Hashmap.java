/*
 * HASH MAPPING CODE
 * 
 * Name      Phone number
 * rajiv      6698745689
 * arjun      1457895623
 * mani       7894512368
 *                 
 * 
 * */


package Solution;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {

	public static void main(String[] args) {
		
		System.out.println("Hashmap program:");
		HashMap<Integer,String> h = new HashMap<Integer ,String>();
		
		h.put(66923578 , "rajiv");
		h.put(66923784 , "arjun");
		h.put(66921457 , "mani");

		//System.out.println(h.size());
		
		for(Map.Entry <Integer,String>entry:h.entrySet())
		{
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ":" +value);
			
		}
	}

}
