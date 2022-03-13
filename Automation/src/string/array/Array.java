package string.array;

import java.util.Arrays;

public class Array {
public static void main(String[] args) {
	int a[]= {12,2,4,5,3,8,6,9,};
	System.out.println(a[1]);
	
	for(int i=0; i<=a.length-1; i++) {
		System.out.println(a[i]);
	}
	
	System.out.print("-----------------------------");
	System.out.println(" ");
	Arrays.sort(a);
	for(int i=a.length-1; i>=0; i--) {
		System.out.print(a[i]+" ");
	}
	
	
}
}
