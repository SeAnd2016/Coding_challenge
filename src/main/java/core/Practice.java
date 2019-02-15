package core;

/*
Return the product (multiplication) of two minimum numbers in array
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.*;

public class Practice {
	
	static int minNumber(List<Integer> array) {
		
		int min12 = array.get(0);
		
		for (int j = 1; j < array.size(); j++) {
			if (array.get(j) < min12) {min12 = array.get(j);}
		}
		
		return min12;
	}
	
	public static void main(String[] a) {
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		System.out.print("Enter quantity of numbers in array: ");
		int max = input.nextInt();
		for (int i = 0; i < max; i++) {
			System.out.print("Enter array element # " + (i + 1) + " ");
			int arrayNumber = input.nextInt();
			numbers.add(arrayNumber);
			}
		
		input.close();

		int min1 = minNumber(numbers);
		
		System.out.println("First minimum number in array is: " + min1);	
		
		for (int z = 0; z < numbers.size(); z++) {
			if (min1 == numbers.get(z)) {numbers.remove(z); break;}
		}
		
		System.out.print("Array numbers after min1 number was removed: ");
		for (int x = 0; x < numbers.size(); x++) {
			System.out.print(numbers.get(x) + " ");
		}
		
		System.out.println("");
		
		int min2 = minNumber(numbers);
		
		System.out.println("Second minimum number in array is: " + min2);
		System.out.println("The product (multiplication) of two  minimum numbers in array is: " + (min1 * min2));
		}
}
