package forloop;

public class Homework1 {

	public static void main(String[] args) {
		for (int i=1; i<=9; i++) {
			for (int j=2; j<=5; j++) {
				int a = j*i;
				if (a<10) {
					System.out.print(j + "*" + i + "=" + j * i + "   ");
				} else {
					System.out.print(j + "*" + i + "=" + j * i + "  ");
				}
			}
			System.out.println();
		}
	}

}
