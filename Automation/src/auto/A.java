package auto;

public class A {
public static void main(String [] args) {
	String s1="ABC";
	String s2=new String ("ABC");
	System.out.println(s1);
	System.out.println(s2);
	String s="Velocity";
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	System.out.println(s.indexOf("l"));
	System.out.println(s.charAt(4));
	System.out.println(s.startsWith("Vel"));
	System.out.println(s.endsWith("ty"));
	
}
}
