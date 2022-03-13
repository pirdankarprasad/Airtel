package collection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class Vector1 {
public static void main(String[] args) {
	Vector vr=new Vector();
	System.out.println(vr.size());
	System.out.println(vr.capacity());
	vr.add(2);
	vr.add("java");
	vr.add(1234567890);
	vr.add('a');
	vr.add(11.5);
	System.out.println(vr);
	System.out.println(vr.indexOf('a'));
	System.out.println(vr.get(2));
	System.out.println(vr.contains(456));
	vr.set(3, 4);
	System.out.println(vr);
	vr.remove(2);
	System.out.println(vr);
	Enumeration el = vr.elements();
	
	
	Collections.reverse(vr);
	while(el.hasMoreElements()) {
		System.out.println(el.nextElement());
	
	}
	
}
}
