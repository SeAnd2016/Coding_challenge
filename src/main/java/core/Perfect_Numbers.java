package core;

import java.util.Scanner;

/*
Perfect number is a positive integer that is equal to the sum of its proper divisors (6 => 1 + 2 + 3).

Problem: Print out perfect numbers up to given number: ex. 10,000
 */

public class Perfect_Numbers {
	
	public static boolean isPerfect(int number) {
		int temp = 0;
		for (int i = 1; i <= number / 2; i++) {if (number % i == 0) {temp += i;}}
		if (temp == number) {return true;}
		else {return false;}
	}

	public static void main(String[] args) {
		
		System.out.print("Please enter max number: ");
		Scanner input = new Scanner(System.in);
		int max = input.nextInt(); input.close();
		
		for (int i = 1; i <= max; i++) {if (isPerfect(i)) {System.out.print(i + ", ");}
	}
  }
}
