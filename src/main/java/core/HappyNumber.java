package core;

// Happy number is a positive integer, replace the number by the sum of the squares of its digits, 
//and repeat the process until the number is equals 1, if it loops endlessly its called Unhappy number. 
//(ex. 7 -> 49 -> 97 -> 130 -> 10 -> 1)

import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class HappyNumber {
	
	public static boolean isHappy(int number) {
		Set<Integer> unique = new HashSet<Integer>();
		while (unique.add(number)) {int value = 0;
			while (number > 0) {value += Math.pow(number % 10, 2);
												  number /= 10;}
		 										  number = value;}
		return number == 1;}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt(); input.close();
		System.out.print(number + " is ");
		System.out.println(isHappy(number) ? "Happy number" : "Unhappy number");

	}
}
