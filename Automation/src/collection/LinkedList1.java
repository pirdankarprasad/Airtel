package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList1 {
public static void main(String [] args) {
	LinkedList l=new LinkedList();
	l.add(1);
	l.add("ABC");
	l.add(11.5);
	l.add('v');
	l.add(123);
	l.add(null);
	System.out.println(l);
	System.out.println(l.indexOf("ABC"));
	System.out.println(l.get(2));
	System.out.println(l.contains(123));
	l.add(2, null);
	l.set(3, 3);
	l.addLast("Last");
	l.addFirst("First");
	System.out.println(l);
	l.removeFirst();
	l.removeLast();
	System.out.println(l);
	l.element();
	
}
}
