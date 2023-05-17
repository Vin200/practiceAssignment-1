package com.calculator;
import java.util.Scanner;

public class MainMethod {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		while(true) {
			System.out.println("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\n5. Exit");
			System.out.println("Enter your choice:");
			
			int choice = sc.nextInt();
			int x=0, y=0;
			if(choice<5) {
				System.out.println("Enter two numbers ");
				x = sc.nextInt();
				y = sc.nextInt();
			}
			Calculator c = new Calculator(x, y);
			
		
			switch(choice) {
			case 1:
				System.out.println("The summation of "+x+" and "+y+" is: "+c.add());
				break;
				
			case 2:
				System.out.println("The Substraction of "+x+" and "+y+" is: "+c.sub());
				break;
				
			case 3:
				System.out.println("The Multiplication of "+x+" and "+y+" is: "+c.mul());
				break;
				
			case 4:
				System.out.println("The Division of "+x+" and "+y+" is: "+c.div());
				break;
			
			case 5:
				System.exit(0);
				break;
			default:
				System.out.println("Enter valid choice");
			}
			
		}

	}

}
