package oops;

public class MethodsDemo {
          public static void main(String[] args) {
			Calculator cal=new Calculator();
			System.out.println(cal.toAdd(50, 50));
			double k=Calculator.toMul(3.5, 6.5);
			System.out.println(k);
			int s=Calculator.toSub(10 , 5);
			System.out.println(s);
			
			
		}
          
          
          
         static class Calculator{
        	  
          
	        //Non static parameterized  method 
	        int toAdd (int i, int j){
			int k =i+j;
			return k;
			}
	        
	        //Static method with int return type 
	        static int toSub(int x , int y) {
	        	int z=x-y;
	        	return z;
	        	
	        }
	       
	        //static parameterized method
	        static double toMul(double a , double b) {
	        	double c=a*b;
	        	return c;
	        }
}
}



