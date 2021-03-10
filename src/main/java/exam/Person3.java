package exam;

public class Person3 {
	
	int point = 0;
	
	public void play(String s) {
		if (s.equals("k")) {
			point = 99;
		} else if (s.equals("q")) {
			if (point <= 79) {
				point += 20;
			} else {
				point -= 20;
			}
		} else {
			int n = Integer.parseInt(s);
			point += n;
		}
	}

}
