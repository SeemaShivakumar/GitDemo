package javaexamples;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method status
		System.out.println("Master Branch1");
		System.out.println("Master Branch2");
		System.out.println("Master Branch3");
		System.out.println("GIT DEMO");
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Seema");//add elements in array
		al.add("Acchhu");
		al.add("Seema");
		System.out.println("Array list elements are" +al);
		//adding by using index
		al.add(0,"Jaanu");
		System.out.println("Updated Array list elements are" +al);
		//remove
		al.remove("Seema");
		al.remove(0);
		System.out.println("Updated Array list elements after removing" +al);
		al.get(0);
		System.out.println("0th index" + al.get(0));
		al.contains("Acchhu");
		System.out.println("Acchhu is preset in the Array list" +al.contains("Acchhu"));
		al.indexOf("Seema");
		
		System.out.println("Index of seema is" +al.indexOf("Seema"));
		
		System.out.println("Array list elements are present or not " +al.isEmpty());
		System.out.println("Size of Array list elements are" +al.size());
		
		//can accept duplicate values
		//arrays have fixed size,arraylist is dynamic
	}

}
