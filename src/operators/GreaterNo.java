package operators;

import java.util.Scanner;

public class GreaterNo {
public static void main(String[] args) {
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter first No:");
	int Number1=sc.nextInt();
	System.out.println("Enter Second No:");
	int Number2= sc.nextInt();
	System.out.println("Enter Third No:");
	int Number3= sc.nextInt();
	if(Number1>Number2 && Number1>Number3) {
		System.out.println("Number 1 is greater no");
	}else if(Number2>Number1 && Number2>Number3) {
		System.out.println("Number 2 is the greater no");
	}else {
		System.out.println("Number 3 is the greater no");
	}
}
}
