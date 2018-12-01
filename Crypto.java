// Solution to Deitel Exercise 4.38

import java.util.Scanner;

public class Crypto {

	public static void main(String[] args) {
		System.out.println("Enter you 4 digit number");
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		int inputInt = Integer.parseInt(inputString);
		
		if(inputInt >= 10000) {
			System.out.println("Input must be a 4 digit number");
		}
		else {
		
			int firstDigit = inputInt / 1000;
			int secondDigit = inputInt / 100;
			int thirdDigit = inputInt / 10;
			int fourthDigit = inputInt % 10;
			
			System.out.print((thirdDigit + 7) % 10);
			System.out.print((fourthDigit + 7) % 10);
			System.out.print((firstDigit + 7) % 10);
			System.out.print((secondDigit + 7) % 10);
		}
	}
	
}
