package dowhile;

import java.util.Random;
import java.util.Scanner;

public class Dowhile1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int secret = r.nextInt(10)+1;
		System.out.println("secret number is: " + secret);
		int num = 0;
		//
		while (secret != num) {
			System.out.println("Please enter a number (1-10):");
			num = Integer.parseInt(scan.next());
			System.out.println("num: " + num);
			//
			if (num < secret) {
				System.out.println("Number " + num + " is too small, please guess bigger number");
			} else {
				if (num == secret) {
					System.out.println("You got it, the secret number is " + num);
				} else {
					System.out.println("Number " + num + " is too big, please guess smaller number");
				}
			}
		}
	}

}
