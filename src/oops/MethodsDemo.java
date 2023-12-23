package oops;

public class MethodsDemo {
          public static void main(String[] args) {
			Calculator cal=new Calculator();
			System.out.println(cal.toAdd(50, 50));
			double k=Calculator.toMul(3.5, 6.5);
			System.out.println(k);
			
			
		}
          
          
          
         static class Calculator{
        	  
          
	        //Non static parameterized  method 
	        int toAdd (int i, int j){
			int k =i+j;
			return k;
			}
	       
	        //static parameterized method
	        static double toMul(double a , double b) {
	        	double c=a*b;
	        	return c;
	        }
}
}



