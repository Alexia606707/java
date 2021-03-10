package bmi;

public class Person1 {
	
	float w;
	float h;
	
	public void bmi() {
		float bmi = w / (h*h);
		System.out.println(bmi);
	}

}
