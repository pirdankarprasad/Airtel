package trycatch;

public class Exception {
public static void main(String[] args) {
	try {
	String str[]= {"weeer", "asfed", "qweert"};
	System.out.println(str[3]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Okay");
}
	

	
	
}
}
