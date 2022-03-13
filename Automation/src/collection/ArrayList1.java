package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList1 {
public static void main(String[] args) {
	ArrayList ar=new ArrayList();
	ar.add(22);
	System.out.println(ar.size());
	ar.add("Java");
	ar.add(123);
	ar.add(11.2);
	System.out.println(ar);
	System.out.println(ar.isEmpty());
	System.out.println(ar.indexOf(22));
	ar.add(2, 2);
	System.out.println(ar);
	ar.set(1, 25);
	System.out.println(ar);
	System.out.println(ar.contains(25));
	System.out.println(ar.get(2));
	ar.remove(4);
	System.out.println(ar);
	System.out.println(ar.get(3));
	Iterator itr = ar.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
		
	}
    ListIterator lt = ar.listIterator();
    System.out.println(lt.next());
	
	
	}
 
	
	
}

