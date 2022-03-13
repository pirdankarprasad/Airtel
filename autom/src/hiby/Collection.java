package hiby;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection {
public static void main(String[] args) throws InterruptedException {
	ArrayList ar=new ArrayList();
	ar.add(4);
	ar.add("Hello");
	ar.add(10.5f);
	ar.add('a');
	ar.add(null);
	ar.add(true);
	ar.add(4);
	ar.add("JAva");
	ar.add('b');
	ar.add(null);
	ar.add(5);
	ar.add(6);
	
	System.out.println(ar);
	System.out.println(ar.lastIndexOf(null));
	System.out.println(ar.contains(null));
	System.out.println(ar.get(4));
	ar.add(4, 5);
	System.out.println(ar);
	ar.remove(4);
	System.out.println(ar);
	
	Iterator itr = ar.iterator();
	//while(itr.hasNext()) {
		System.out.println(itr.next());
		Thread.sleep(1000);
	//}
	for(int i=0; i<=ar.size()-1; i++) {
		System.out.println(ar.get(i));
	}
	}
}
