package javaexamples;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
					
				//HashSet,TreeSet,LinkedHashSet implents SET interface
				//doesnot accept duplicate values
				//There is no guarantee that elements are stored in sequential  order
				HashSet<String> hs = new HashSet<String>();
				hs.add("Shivu");
				hs.add("Chinnu");
				hs.add("INDIA");
				hs.add("USA");
				hs.add("INDIA");
				hs.add("Seema");
				System.out.println("Set elements are" + hs);
				//hs.remove("USA");
				//System.out.println("INDIA is removed " + hs.remove("INDIA"));
				System.out.println(("Elements are" +hs.isEmpty()));
				
				Iterator<String> i = hs.iterator();
				while(i.hasNext()) {
					System.out.println(i.next());
				}
				
				
				

			

		}


	}


