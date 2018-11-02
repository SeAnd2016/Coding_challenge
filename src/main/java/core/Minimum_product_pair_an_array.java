package core;

/*
Return the product (multiplication) of two minimum numbers in array
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Minimum_product_pair_an_array {
	
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
			
		int min1 = numbers.get(0);
		
		for (int j = 1; j < numbers.size(); j++) {
			if (numbers.get(j) < min1) {min1 = numbers.get(j);}
		}
		
		System.out.println("First minimum number in array is: " + min1);	
		
		for (int z = 0; z < numbers.size(); z++) {
			if (min1 == numbers.get(z)) {numbers.remove(z); break;}
		}
		
		System.out.print("Array numbers after min1 number was removed: ");
		for (int x = 0; x < numbers.size(); x++) {
			System.out.print(numbers.get(x) + " ");
		}
		
		System.out.println("");
		
		int min2 = numbers.get(0);
		
		for (int c = 1; c < numbers.size(); c++) {
			if (numbers.get(c) < min2) {min2 = numbers.get(c);}
		}
		System.out.println("Second minimum number in array is: " + min2);
		System.out.println("The product (multiplication) of two  minimum numbers in array is: " + (min1 * min2));
		}
}
