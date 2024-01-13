package constructordemo;

public class Constructor1 {
	public static void main(String[] args) {
		A s1=new A(10);
		s1.game();
	}
}

 class A{
	   int i=10;
       A(){
    	   
    	   this(10);
        	System.out.println("Default constructor");
        
        }
 
        
        A(int i){
        	System.out.println(this.i=i);     //Initializing instance variable 
        	System.out.println("parameterized constructor");
        	
        }
        
        public void game() {
           System.out.println("New game");
           this.game2();
        
        }
        
        public void game2() {
        	System.out.println("game 2");
        }
        
 
 }


        
        