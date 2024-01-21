package access1;

public class Test {
  static int x=0;
  public static void main(String[] args) {
	System.out.println(fun());
}
  
  static int fun() {
	  return ++x;
  }
}
