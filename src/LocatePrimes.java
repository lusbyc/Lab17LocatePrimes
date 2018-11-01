import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// Locate primes at specific locations
// Primes	Prime Location
//	2		1
//	3		2
//	5		3
//	7		4
//	11		5
//	13		6
//	17		7
//	19		8
//	23		9
//	29		10
public class LocatePrimes {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int userInput = 0;

		System.out.println(
				"This program is designed to tell you where your prime number \nof choice is located on a scale of prime numbers.");

//		System.out.println(
//				"Please enter an index and I will tell you which prime number corresponds to that location:  ");
		
		System.out.println("Which number are you looking for? i.e. the 1st, 2nd, 3rd prime?  ");
		userInput = scan.nextInt();
//		String userInputAsString = Integer.toString(userInput);

		int [] primeNumbers = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		System.out.println();
		
		
		
		
		
//		if (userInput >= 4 && userInput <= 10) {		
//		System.out.println("You are looking for the " + userInput + "th prime number.\nIt's value is " + primeNumbers[userInput-1] +".");
//		if (userInput == 2) {
//			System.out.println("You are looking for the " + userInput + "nd prime number.\nIt's value is " + primeNumbers[userInput-1] +".");
//			if (userInput == 3) {
//				System.out.println("You are looking for the " + userInput + "rd prime number.\nIt's value is " + primeNumbers[userInput-1] +".");
//			
		}
//
//		if (primeNumbers.toString().contains(userInputAsString))
//		
//		{System.out.println(primeNumbers[userInput]);

//			Arrays.asList(userInputAsString).indexOf(primeNumbers);
//			
//			System.out.println(userInputAsString.indexOf(primeNumbers.toString()));
//			
//			System.out.println();
//			System.out.println(Arrays.asList(primeNumbers).indexOf(userInput));
//
//			System.out.println("Would you like to find another prime number?  ");
		}

	}

//	pseudocode
//	if user enters 5 and 5% == 0 then display index of 5

	// if user input = 5 and this input is divisible by 5 then search the array and
	// get the index of the
	// element that contains 5

// 	if user enters i and i% == then display index of i
// 	but this test will fail for non primes
// 	must eliminate non primes
	}
}
