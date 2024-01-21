package access1;

 public class main {
	 public static void main(String args[]) {
		System.out.println(fun()); 
	 }
	 
	static int fun() {          //   static method can call static method and cannot call non static method/instance method  
		 return 20;
	 }
}
