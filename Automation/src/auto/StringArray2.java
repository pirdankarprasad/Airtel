package auto;

import java.util.Arrays;

public class StringArray2 {
public static void main(String[] args) {
	int num[]=new int [4];
	num[0]=60;
	num[1]=50;
	num[2]=75;
	num[3]=80;
	
	
	System.out.println(num.length);
	for(int i=0; i<=num.length-1; i++) {
		System.out.println(num[i]);
	}
	System.out.println(" ");
	Arrays.sort(num);
	for(int i=num.length-1; i>=0; i--) {
		System.out.println(num[i]);
	}
	
}
}
