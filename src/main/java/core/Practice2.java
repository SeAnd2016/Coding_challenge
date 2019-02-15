package core;

import java.util.Arrays;

public class Practice2 {
	
	static int numbers(double[] array) {
		
		Arrays.sort(array);
		
		return (int) (array[0] * array[1]);
	}	
	public static void main(String[] a) {
		
		double nums[] = {50, 40, 30, 20, 1.5, 10};
		
		double sum = Practice2.numbers(nums);
		System.out.println(sum);
		
	}
		
	}
