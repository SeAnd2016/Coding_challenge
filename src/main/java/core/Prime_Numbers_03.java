package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Prime number is a number (positive only) which only divisible by 1 and itself.

Example: 2,3,5,7,11,13,17,19,23,29,31
 */

public class Prime_Numbers_03 {
	
	public static boolean isPrime(int number) {
		if (number <= 1) {return false;} //Negative and 1 are not Prime numbers
		if (number == 2 ) {return true;} //2 is only one Even Prime number
		if (number % 2 == 0) {return false;} //Excluding all Even numbers
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {return false;}}
			return true;
		}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter maximum number: ");
		int max = input.nextInt(); input.close();
		
		List<Integer> prime = new ArrayList();
		
		for (int i = 1; i <= max; i++) {
			if (isPrime(i)) {prime.add(i);}}
		
		for (int j = 0; j < (prime.size()); j++) {
			if (j < (prime.size() - 1)) {System.out.print(prime.get(j) + ", ");}
			else System.out.print(prime.get(j) + ".");}
	}
}
