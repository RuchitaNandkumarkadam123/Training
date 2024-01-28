package oops;

public class ClassDemo {
  public static void main(String[] args) {
	  TestOne d5=new TestOne();
	  d5.add(10, 20);
	  TestTwo d6=new TestTwo();
	  TestThree d7=new TestThree();
	  int s1=TestFour.i;
	  System.out.println(s1);
}
}


class TestOne{
	public void add(int i , int j) {
		int sum=i+j;
		System.out.println(sum);
		
	}
}

class TestTwo{
	
	
}

class TestThree{
	
}
class TestFour{
	static int i =20;
}
