package core;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class First_unique_number_in_array_Scanner {
	
	public static void main(String[] args) {
		
		System.out.print("Enter the quantity of numbers in array: ");
		Scanner input = new Scanner(System.in);
		int max = input.nextInt();
		System.out.println();
		
		List<Integer> unique = new ArrayList<Integer>();
		
		for (int a = 0; a < max; a++) {
			System.out.print("Enter array element # " + (a + 1) + ": ");
			int arrayNumber = input.nextInt();
			unique.add(arrayNumber);
		}
			input.close();
			
		System.out.println();
			
		System.out.print("There are numbers in array: ");
		for (int i = 0; i < unique.size(); i++) {
		System.out.print(unique.get(i) + " ");}
		
		System.out.println();
		LOOP:
		for (int j = 0; j < unique.size(); j++) {
			int z = 0;
			int x = unique.get(j);
			for (int f = 0; f < unique.size(); f++) {
				if (x == unique.get(f)) {z++;}}
			if (j == (unique.size() - 1) & z != 1) {System.out.println("Array doesn't have unique numbers");}
			if (z == 1) {System.out.println("The first unique number in array is: " + x); break LOOP;}
			}
	 }	
}