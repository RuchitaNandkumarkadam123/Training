package oops;

public class VariableScope {
       public static void main(String[] args) {
    	   Demo5 D5=new Demo5();
    	   D5.add();
    	   //Demo5.j;    //while calling static variable i am getting error can u please help me with that 
	}
}
 class Demo5{
	 
	int i =10;          //instance variable 
	static int j =20;     //Static variable  
	public void add() {
		System.out.println(this.i=i);
		int a=50 ;        //local variable 
		System.out.println(a);
	}
}
