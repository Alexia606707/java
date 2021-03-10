package array;

import java.util.Random;

public class Array3 {

	public static void main(String[] args) {
		int n[] = new int[6];
		Random r = new Random();
		//
		for (int i=0; i<n.length; i++) {
			n[i] = r.nextInt(6)+1;
			System.out.println(n[i]);
		}
	}

}
