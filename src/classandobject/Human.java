package classandobject;

public class Human {
	
   
	String name;
	double height;
	double weight;
	String color;
	
	public void speak(String content){
	 System.out.println(content);
	}
	
	void walk() {
		
	}

	void cry() {
		
	}

	public static void main(String[] args) {
		Human h1=new Human();
		h1.speak("Hello");
		
	}
}



