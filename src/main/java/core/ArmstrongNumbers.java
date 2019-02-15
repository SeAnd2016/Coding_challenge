package core;

import java.util.Scanner;

/* Armstrong number is an n-digit number that is equal to the sum of the n-th powers of its digits.
Example:  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407*/

public class ArmstrongNumbers {
	
	private static boolean isArmstrong(int number) {
	// int length = String.valueOf(number).length();

	int temp = number;
	int length = 0;
	while (temp != 0) {length++; temp = temp / 10;}
	int result = 0;
	int original = number;
	while (number > 0) {
		//result = result + ((int) Math.pow(number % 10, length));

		result = result + power(number % 10, length); number = number / 10;}
	if (original == result) {return true;}
	else {return false;}}
	
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt(); input.close();

		// System.out.print(number + " is " + (isArmstrong(number) ? "an Armstrong number":"not an Armstrong number"));
		int max = number;
		for (int i = 0; i <= max; i++) {if (isArmstrong(i)) {System.out.print(i + ", ");}}
		}
	static int power(int number, int p) {
		int pow = 1;
		for (int i = 1; i <= p; i++) {pow = pow * number;}
		return pow;}
	}