package acessmodifierdemo;

 class ProtectedAccessModifier {
    public static void main(String[] args) {
		Test t=new Test();
		System.out.println(t.x + " "+t.y);
	}
}
 
 
 class Test{
	 protected int x , y;
 }
