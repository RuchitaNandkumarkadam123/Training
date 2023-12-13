package oops;

public class Car {

	public static void main(String[] args) {
		
		Vehicle v1=new Vehicle();
		v1.Color="Red";
		v1.number=3126;
		v1.model="BMW";
		 
		Vehicle v2=new Vehicle();
		v2.Color="Black";
		v2.number=2619;
		
		
				
		System.out.println("My car color is" +" - "+v1.Color );
		System.out.println("My car number is" +" - "+v1.number );
		System.out.println("My car Modal is" +" - "+v1.model );
		
		
		v1.toDrive();
		System.out.println(v2.model);
		
	}
}
