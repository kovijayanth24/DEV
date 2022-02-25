package Jayanth;

import java.util.Scanner;

public class ArithmeticCalculator {
     
	public static void main(String[] args) {
		int num1,num2;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter 1st number");
		num1 = in.nextInt();
		System.out.println("Enter 2nd number");
		num2 = in.nextInt();
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		int o = in.nextInt();
		switch(o)
		{
		case 1:
		System.out.println("Addition = "+(num1+num2));
		break;
		case 2:
		System.out.println("Subtraction = "+(num1-num2));
		break;
		case 3:
		System.out.println("Multiplication = "+(num1*num2));
		break;
		case 4:
		System.out.println("Division = "+(num1/num2));
		}
	}	
		
}
