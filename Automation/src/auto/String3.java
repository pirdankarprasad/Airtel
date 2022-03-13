package auto;

public class String3 {
public static void main(String[] args) {
	String S="This is java program";
	String [] str=S.split(" ");
	System.out.println(str[2]);
	System.out.println(S.replace("T", "t"));
	System.out.println(S.length());
	for (int i=0; i<=S.length()-1; i++) {
		System.out.print(S.charAt(i));
	}
	System.out.println(" ");
	for (int i=S.length()-1; i>=0; i--) {
		System.out.print(S.charAt(i));
		
		
	}
	
}
}
