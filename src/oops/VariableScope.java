package oops;

public class VariableScope {
       public static void main(String[] args) {
    	   Demo5 D5=new Demo5();
    	   D5.add();
    	   System.out.println(Demo5.j);
    	   
    	    
       } 
}
    	 
 class Demo5{ 
	int i =10;          //instance variable 
	static int j =20;     //Static variable  
	public void add() {
		System.out.println(this.i);
		int a=50 ;        //local variable 
		System.out.println(a);
	}
}
