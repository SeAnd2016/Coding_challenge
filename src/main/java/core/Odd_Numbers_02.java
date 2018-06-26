package core;

	public class Odd_Numbers_02 {

		public static void main(String[] args) {

			int max = 20;
			System.out.print("Odd numbers are: ");
			for (int i = 1; i <= max; i++) {
				if (i % 2 != 0 & i != max) {System.out.print(i + ", ");}
				else if (i == max) {System.out.print(i + ".");}
     } 
   }
}

