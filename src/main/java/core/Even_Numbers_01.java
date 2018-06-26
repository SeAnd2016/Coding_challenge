package core;

public class Even_Numbers_01 {

		public static void main(String[] args) {
			int max = 10;
			System.out.print("Even numbers are: ");
			for (int i = 0; i <= max; i++) {
				if (i % 2 == 0 & i != max) {System.out.print(i + ", ");}
				else if (i == max) {System.out.print(i + ".");}
		}
	  }
	}

