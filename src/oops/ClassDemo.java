package oops;

public class ClassDemo {
  public static void main(String[] args) {
	  Demo10 d5=new Demo10();
	  d5.add(10, 20);
	  Demo6 d6=new Demo6();
	  Demo7 d7=new Demo7();
	  int s1=Demo8.i;
	  System.out.println(s1);
}
}


class Demo10{
	public void add(int i , int j) {
		int sum=i+j;
		System.out.println(sum);
		
	}
}

class Demo6{
	
	
}

class Demo7{
	
}
class Demo8{
	static int i =20;
}
