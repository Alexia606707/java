package exam;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		int n;
		int sum = 0;
		
		do {
			System.out.println("Please insert coin:");
			Scanner scan = new Scanner(System.in);
			String s = scan.next();
			
			if (s.startsWith("a")) {
				if (sum >= 10) {
					sum -= 10;
					System.out.println("Don! Total: " + sum);
				} else {
					System.out.println("Beep! Total: " + sum);
				}
				System.out.println("Returning $10: " + (sum/10));
				System.out.println("Returning $5: " + ((sum%10)/5));
				System.out.println("Returning $1: " + (((sum%10)%5)/1));
				System.out.println("Bye");
			}
			if (s.startsWith("b")) {
				if (sum >= 15) {
					sum -= 15;
					System.out.println("Don！ Total: " + sum);
				} else {
					System.out.println("Beep！ Total: " + sum);
				}
				System.out.println("Returning $10: " + (sum/10));
				System.out.println("Returning $5: " + ((sum%10)/5));
				System.out.println("Returning $1: " + (((sum%10)%5)/1));
				System.out.println("Bye");
			}
			if (s.startsWith("c")) {
				if (sum >= 23) {
					sum -= 23;
					System.out.println("Don！ Total: " + sum);
				} else {
					System.out.println("Beep！ Total: " + sum);
				}
				System.out.println("Returning $10: " + (sum/10));
				System.out.println("Returning $5: " + ((sum%10)/5));
				System.out.println("Returning $1: " + (((sum%10)%5)/1));
				System.out.println("Bye");
			}
			n = Integer.parseInt(s);
			sum += n;
			System.out.println("Total: " + sum);
			
		} while (n != 0);
		System.out.println("Bye");
		
	}

}
