package bmi;

public class Bmi2 {

	public static void main(String[] args) {
		Person2 p = new Person2();
		p.weight = 46f;
		p.height = 1.64f;
		float bmi = p.bmi();
		System.out.println(bmi);
		bmi = ((int)(bmi*100f+0.5f))/100f;
		System.out.println(bmi);
		p.hello("Alexia");
	}

}
