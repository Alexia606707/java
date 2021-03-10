package exam;

public class Person1 {
	
	int sum = 0;
	int n;
	
	public void insert(String s) {
		if (s.equals("a")) {
			if (sum >= 10) {
				sum -= 10;
				System.out.println("Don! Total: " + sum);
			} else {
				System.out.println("Beep! Total: " + sum);
			}
		} else if (s.equals("b")) {
			if (sum >= 15) {
				sum -= 15;
				System.out.println("Don! Total: " + sum);
			} else {
				System.out.println("Beep! Total: " + sum);
			}
		} else if (s.equals("c")) {
			if (sum >= 23) {
				sum -= 23;
				System.out.println("Don! Total: " + sum);
			} else {
				System.out.println("Beep! Total: " + sum);
			}
		} else {
			n = Integer.parseInt(s);
			sum += n;
			System.out.println("Total: " + sum);
		}
	}

}
