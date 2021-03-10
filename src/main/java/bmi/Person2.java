package bmi;

public class Person2 {
	
	//Field
	float weight;
	float height;
	//Method
	public float bmi() {
		float bmi = weight / (height*height);
		return bmi;
	}
	//Method
	public void hello(String name) {
		System.out.println("Hi, " + name);
	}

}
