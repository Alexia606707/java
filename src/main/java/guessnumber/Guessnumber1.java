package guessnumber;

import java.util.Random;
import java.util.Scanner;

public class Guessnumber1 {

	public static void main(String[] args) {
		Random r = new Random();
		int secret = r.nextInt(100)+1;
		System.out.println("(secret number is " + secret + ")");
		System.out.println("Please enter a number (1-100):");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("data: " + s);
		int num = Integer.parseInt(s);
		//
		if (num > secret) {
			System.out.println("Smaller");
		} else {
			if (num == secret) {
				System.out.println("Bingo!");
			} else {
				System.out.println("Bigger");
			}
		}
	}

}
