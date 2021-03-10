package forloop;

import java.util.Scanner;

public class Forloop3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int n = Integer.parseInt(scan.next());
		//
		int sum = 0;
		for (int i=1; i<=n; i++) {
			System.out.println(i);
			sum+=i;
		}
		System.out.println("The sum is " + sum);
	}

}
