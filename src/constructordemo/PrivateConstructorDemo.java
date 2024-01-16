package constructordemo;

public class PrivateConstructorDemo {
public static void main(String[] args) {
	A a1=new A();
	
}

}

class A{
	A(){
		this(10);
		System.out.println("Non paramertized constructor");
	}
	A(int i){
		System.out.println("parametrized constructor");
	}

}
