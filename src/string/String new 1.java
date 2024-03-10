package string;

public class stringDemo {
public static void main(String[] args) {
	

	
	String s1="Ruchita";  
	String s2="Java";
	String s3="Ruchita";
	String s4=new String("Ruchita");
	String s5= "AbC#$dEf";
	String s6="ab&fdrgt";
	
	
	System.out.println(s1 == s3);
	System.out.println(s1==s2);
	System.out.println(s1==s4);
	
	System.out.println();
	
	System.out.println(s1.equals(s2));
	System.out.println(s3.equals(s4));
	
	System.out.println(s6.toUpperCase());
	System.out.println(s5.toLowerCase());
	}
}
