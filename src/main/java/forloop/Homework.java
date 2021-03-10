package forloop;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number (2-9):");
		int n = Integer.parseInt(scan.next());
		//
		for (int i=1; i<=9; i++) {
			int a = n*i;
			if (a<10) {
				System.out.println(n + "*" + i + "= " + n * i);
			} else {
				System.out.println(n + "*" + i + "=" + n * i);
			}
		}
	}

}
