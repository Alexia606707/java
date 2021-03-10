package guessnumber;

import java.util.Scanner;

public class Guessnumber {

	public static void main(String[] args) {
		int secret = 1;
		System.out.println("Please enter a number (1-10):");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("data: " + s);
		//
		int num = Integer.parseInt(s);
		boolean result = num > secret;
		System.out.println(result);
		if (result) {
			System.out.println("Smaller");
		} else {
			System.out.println("Bigger");
		}
	}

}
