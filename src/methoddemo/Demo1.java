package methoddemo;

public class Demo1 {
public static void main(String[] args) {
	Demo2 d1=new Demo2();
	d1.sum(10, 20);
	System.out.println(Demo2.cube(3, 4, 8));
	
}
}
//create 2 methods one should be static and one non static method
class Demo2{
	static public int cube(int a , int b , int c) {
		return a*b*c;
		
	}
	 public void sum(int x, int y) {
		 int a1=x+y;
		 System.out.println(a1);
	 }
}
