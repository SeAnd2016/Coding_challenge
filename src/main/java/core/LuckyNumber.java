package core;

import java.util.Scanner;

//Lucky number is a sum of its digits until the last digit remains single. (ex. 777 => 3 (7 + 7 + 7 = 21 then 2 + 1 = 3))

public class LuckyNumber {
	
	public static int lucky(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10; number /= 10;}
		sum = (sum < 10) ? sum : lucky(sum); // Base case: Ternary operagtor => false
		return sum;
		}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt(); input.close();
		System.out.println("Lucky number is: " + lucky(number));
	}
}


