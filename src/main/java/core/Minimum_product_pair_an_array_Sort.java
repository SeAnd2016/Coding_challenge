package core;

/*
Return the product (multiplication) of two minimum numbers in array
 */

import java.util.Arrays;

public class Minimum_product_pair_an_array_Sort {
	
	static int MinNumbers(int[] numbers) {
		
		Arrays.sort(numbers);
		return numbers[0] * numbers[1];
	}
	
	public static void main(String[] a) {
		
		int[] numb = {100, 20, 4, 5, 78, 3};
		int result = Minimum_product_pair_an_array_Sort.MinNumbers(numb);
		System.out.println(result);
		
	}

}
