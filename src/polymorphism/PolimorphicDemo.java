package polymorphism;

public class PolimorphicDemo {
    public static void main(String[] args) {
		double s=Calculator.sum(20, 30.6f);
		System.out.println(s);
	}
    
}

  // int-4 byte
//float-4 byte
//double-8 byte
class Calculator{
	//method overloading- it is compile time polymorphism.
	
	static int sum(int i , int j) {
		System.out.println("m1");
		int k = i+j;
		return k;
	}
	
	static double sum(double a,double b) {
		System.out.println("m2");
		double c=a+b;
		return c;
	}
		static float sum(float x,float y) {
			System.out.println("m3");
			float z=x+y;
			return z; 
			
		}
		 static float sum( int p, float q) {
			 System.out.println("m4");
			 float r=p+q;
			 return r;
		 }
		
		}
	
	




    
    

