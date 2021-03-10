package forloop;

import java.util.Scanner;

public class Forloop2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n = Integer.parseInt(scan.next());
		//
		for (int i=1; i<=n; i++) {
			System.out.println(i);
		}
	}

}
