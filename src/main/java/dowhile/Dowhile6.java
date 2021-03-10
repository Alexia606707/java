package dowhile;

import java.util.Random;
import java.util.Scanner;

public class Dowhile6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random r = new Random();
		int secret = r.nextInt(10)+1;
		System.out.println("secret number is: " + secret);
		int counter = 0;
		int num = 0;
		//
		do {
			counter++;
			System.out.println("Please enter a number (1-10): #" + counter);
			num = Integer.parseInt(scan.next());
			System.out.println("num: " + num);
			//
			if (num < secret) {
				System.out.println("Number " + num + " is too small, please guess bigger number");
			} else {
				if (num > secret) {
					System.out.println("Number " + num + " is too big, please guess smaller number");
				}
			}
		} while(secret != num);
		System.out.println("You got it, the secret number is " + num + ", total " + counter + " times");
	}

}
