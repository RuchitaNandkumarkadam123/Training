package constructordemo;

public class ThisDemo {
public static void main(String[] args) {
	 Demo1 d1=new Demo1(10);
	 d1.Demo3();
	 
}
}

 class Demo1{
	 int a=10;
	 Demo1() {
		this(10);         //this keyword for constructor
		int a=20;
		this.a=a;   // this keyword for variable
		System.out.println(a); 
	 }
	 Demo1(int a){
		 System.out.println("parametrized constructor");
	 }
	 
	 public void Demo2() {
		 System.out.println("Demo2 Method");
	 }
	 
	 public void Demo3() {
		 this.Demo2();        //this keyword for method
		 System.out.println("Demo 3 method");
	 }
}
