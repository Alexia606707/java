package dowhile;

import java.util.Scanner;

public class Dowhile4 {

	public static void main(String[] args) {
		System.out.println("Please enter a number (1-9):");
		Scanner scan = new Scanner(System.in);
		int num = Integer.parseInt(scan.next());
		int i = 1;
		do {
			System.out.print(num + " * " + i + " = ");
			if ((num*i) < 10) {
				System.out.print(" ");
			}
			System.out.println((num*i));
			i++;
		} while(i<10);
	}

}
