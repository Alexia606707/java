package bmi;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		System.out.println("Enter your weight:");
		Scanner scan_w = new Scanner(System.in);
		System.out.println("Enter your height:");
		Scanner scan_h = new Scanner(System.in);
		float w = scan_w.nextFloat();
		float h = scan_h.nextFloat();
		//
		Person2 p = new Person2();
		p.weight = w;
		p.height = h/100;
		float bmi = p.bmi();
		bmi = ((int)(bmi*100f+0.5f))/100f;
		//
		System.out.println("Your bmi is " + bmi);
		//
		if (bmi < 18.5) {
			System.out.println("體重過輕");
		} else {
			if (bmi < 24) {
				System.out.println("正常範圍");
			} else {
				if (bmi < 27) {
					System.out.println("過重");
				} else {
					if (bmi < 30) {
						System.out.println("輕度肥胖");
					} else {
						if (bmi < 35) {
							System.out.println("中度肥胖");
						} else {
							System.out.println("重度肥胖");
						}
					}
				}
			}
		}
	}

}
