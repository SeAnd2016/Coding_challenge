package core;

public class Prime_Numbers_03 {

	public static boolean isPrime(int number) {
			if (number <= 1) {return false;} //Negative and 1 are not Prime numbers
			if (number == 2) {return true;} //2 is only one Even Prime number
			if (number % 2 == 0) {return false;} //Excluding all Even numbers
			for (int i = 2; i <= number; i++) {
				if (number % 2 == 0) {return false;}}
				return true;
 } 

	public static void main(String[] args) {
			int max = 100;
			for (int i = 1; i <= max; i++) {
			if (i < (max - 1) & isPrime(i)) {System.out.print(i + ", ");}
			else if (isPrime(i)) {System.out.print(i + ".");}

			}
		}
	}

