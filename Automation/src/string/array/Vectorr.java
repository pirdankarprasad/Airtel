package string.array;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorr {
	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("x");
		v.add(1);
		v.add(null);
		v.add("xyz");
		v.add(12.5);
		System.out.println(v);
		
		
		System.out.println(v.get(4));
		
		 ListIterator vt = v.listIterator();
//		while(vt.hasMoreElements()) {
//			System.out.println(vt.nextElement());
//		}
		Collections.reverse(v);
		while(vt.hasNext()) {
			System.out.println(vt.next());
		}
	}

}
