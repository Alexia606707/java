package hello;

import java.util.Scanner;

public class Hello1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What's your name?");
		String name = scan.next();
		System.out.println("Hello, " + name);
		System.out.println(name + ", how old are you?");
		int age = scan.nextInt();
		System.out.println("Hi, " + name + "(" + age + ")");
	}

}
