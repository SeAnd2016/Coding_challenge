package core;

import java.util.ArrayList;
import java.util.List;

public class First_unique_number_in_array {
	
	public static void main(String[] args) {
	
		List<Integer> unique = new ArrayList() {{add(1); add(2); add(3); add(3); add(2); add(1); add(1); add(1); add(1); add(1); add(3); add(2);}};
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