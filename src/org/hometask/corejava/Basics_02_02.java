package org.hometask.corejava;

import java.util.Scanner;

public class Basics_02_02 {
	
	static double total, result;
	
	public double calculatePercentage(double result, double total) {
        return (result / total) * 100;
    }
	
	public static void main(String[] args) {
		
		Basics_02_02 b= new Basics_02_02();
		
		//Calculator with basic functions like Add, Sub, Multiply, Divide
		char operator;
		Double input1, input2;

		Scanner input = new Scanner(System.in);

		System.out.println("Enter first number: ");
		input1 = input.nextDouble();

		System.out.println("Enter second number: ");
		input2 = input.nextDouble();
		
		total= input1 + input2;

		System.out.println("Choose an operator: +, -, * or /");
		operator = input.next().charAt(0);

		switch (operator) {

		case '+':
			result = input1 + input2;
			System.out.println("Addition of " + input1 + " & " + input2 + " is " + result);
			break;

		case '-':
			result = input1 - input2;
			System.out.println("Substraction of " + input1 + " & " + input2 + " is " + result);
			break;

		case '*':
			result = input1 * input2;
			System.out.println("Multiplication of " + input1 + " & " + input2 + " is " + result);
			break;

		case '/':
			result = input1 / input2;
			System.out.println("Division of " + input1 + " & " + input2 + " is " + result);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
			
		}
		System.out.println("Percentage of the above result is: " +b.calculatePercentage(result, total));
		
		input.close();
	}
}
