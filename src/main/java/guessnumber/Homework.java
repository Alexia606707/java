package guessnumber;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		int secret = 50;
		System.out.println("Please enter a number (1-100):");
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		System.out.println("data: " + s);
		//
		int num = Integer.parseInt(s);
		if (num > secret) {
			System.out.println("Smaller, secret number is between " + "1-" + num);
		} else {
			if (num == secret) {
				System.out.println("Bingo!");
			} else {
				System.out.println("Bigger, secret number is between " + num + "-100");
			}
		}
	}

}
