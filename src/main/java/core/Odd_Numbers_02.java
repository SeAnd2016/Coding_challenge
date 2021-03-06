package core;

/*
Odd numbers (iterative, not recursive)
Odd number is an integer (positive or negative, not a fraction), which is not divisible by 2.
Example: -3, -1, 7, 11

Problem: Print out odd numbers up to given number
 */

import java.util.Scanner;

public class Odd_numbers_02 {
	
	public static void main(String[] args) {
	
	System.out.print("Type minimum number: ");
	Scanner input = new Scanner(System.in);
	int min = input.nextInt();
	System.out.print("Type maximum number: ");
	int max = input.nextInt();
	input.close();
	System.out.print("Odd numbers are: ");
	for (int i = min; i <= max; i++) {
		if (i % 2 != 0 & i != max & i != max - 1) {System.out.print(i + ", ");}
		// Print last odd number, if last number in the line is an odd number
		else if (i % 2 != 0 & i == max) {System.out.print(i + ".");}
		// Print last odd number, if last number in the line is an even number
		else if (i % 2 == 0 & i == max) {System.out.print(i - 1 + ".");}
      }
   }
}