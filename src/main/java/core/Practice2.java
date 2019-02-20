package core;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Practice2 {
	
	public static int numbers(Integer num[]) {
		
		//Arrays.sort(num);
		
		List<Integer> list = Arrays.asList(num);
		Set<Integer> set = new TreeSet(list);

		Integer[] newList = new Integer[set.size()];
		int i = 0;
		for (Integer a: set)
			newList[i++] = a;
			
		return newList[0] * newList[1];
		}
	
	public static void main(String[] a) {
		
		Integer numbers[] = {20, 3, 3, 4, 5, 6, 7};
		
		System.out.print("Produce of two minimum numbers in array is: " + numbers(numbers));
		
	}
		
}