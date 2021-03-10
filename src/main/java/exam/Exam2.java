package exam;

import java.util.Scanner;

public class Exam2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int point = 0;
		while (point <= 99) {
			System.out.println("Point: " + point + ", Please play your card:");
			String s = scan.next();
			if (s.equals("k")) {
				point = 99;
			} else {
				int n = Integer.parseInt(s);
				point += n;
			}
		}
		System.out.println("You loose!");
	}

}
