package methoddemo;

public class Test1 {
public static void main(String[] args) {
	Test2 T2=new Test2();
	int a1=T2.add(T2.add(30,20), T2.add(60, 40));
	System.out.println(a1);
	
}
}
// Use method call directly as argument
class Test2{
	public int add(int i ,int j) {
		return i-j;
	}
}
