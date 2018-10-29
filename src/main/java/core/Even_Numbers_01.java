package core;

/*
Even numbers (iterative, not recursive)
Even number is an integer (positive or negative, not a fraction, including 0), which divisible by 2.
Example: -6, -2, 0, 8, 20, 100

Problem: Print out even numbers up to given number
*/

import java.util.Scanner;

public class Even_Numbers_01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter minimum number: ");
		int min = input.nextInt();
		System.out.print("Enter maximum number: ");
		int max = input.nextInt(); input.close();
		System.out.print("Even numbers are: ");
		for (int i = min; i <= max; i++) {
			if (i % 2 == 0 & i != max & i != max - 1) {System.out.print(i + ", ");}
			// Print last even number, if last number in the line is an even number
			else if (i % 2 == 0 & i == max) {System.out.print(i + ".");}
			// Print last even number, if last number in the line is an odd number
			else if (i % 2 != 0 & i == max) {System.out.print(i - 1 + ".");}
					        }
	}
}