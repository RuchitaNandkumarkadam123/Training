package operators;

import java.util.Scanner;

public class PositiveOrNegativeNo {
public static void main(String[] args) {
	

	
	
	Scanner scan=new Scanner(System.in);
	while(true) {
	System.out.println("------");
	System.out.println("Enter a number :  ");
	
	int no=scan.nextInt();
	if(no<0) {
		System.out.println("A negative no");
	}else
	{
		System.out.println(" A Positive no");
	}
	}
}
}
