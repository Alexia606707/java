package exam;

import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Person3 p = new Person3();
		
		do {
			System.out.println("Point: " + p.point + ", Please play your card:");
			String s = scan.next();
			
			p.play(s);
			
		} while (p.point <= 99);
		
		System.out.println("You loose!");
	}

}
