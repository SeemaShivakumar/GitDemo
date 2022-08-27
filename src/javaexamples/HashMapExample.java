package javaexamples;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		hm.put(0, "Hello");
		hm.put(1, "Hi");
		hm.put(2, "Good Morning");
		System.out.println(hm.get(2));
		//.remove(2);
	//ystem.out.println(hm.get(2));
		Set sn = hm.entrySet();
		Iterator it = sn.iterator();
		
		while(it.hasNext()) {
			Map.Entry mp =(Map.Entry)it.next();
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}
		
	}
		
		
	}


