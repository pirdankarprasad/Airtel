package auto;

public class String2 {
public static void main(String[] args) {
	String s="abcd efg hij";
	String[] str=s.split(" ");
	System.out.println(str[0]);
	System.out.println(str[1]);
	System.out.println(str[2]);
	System.out.println(s.replace("a", "A"));
	System.out.println(s.replace("ab", "xy"));
}
}
