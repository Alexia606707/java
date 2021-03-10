package exam;

import java.util.Scanner;

public class Exam1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person1 p = new Person1();
		
		do {
			System.out.println("Please insert coin:");
			String s = scan.next();
			
			p.insert(s);
			
		} while (p.n != 0);
		
		System.out.println("Returning $10: " + (p.sum/10));
		System.out.println("Returning $5: " + ((p.sum%10)/5));
		System.out.println("Returning $1: " + (((p.sum%10)%5)/1));
		System.out.println("Bye");
	}

}
