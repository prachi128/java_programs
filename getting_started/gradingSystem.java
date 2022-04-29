import java.util.*;

class gradingSystem {
	public static void solutions(int a) {
		if (a > 90) {
			System.out.println("excellent");
		} else if (a > 80) {
			System.out.println("good");
		} else if (a > 70) {
			System.out.println("fair");
		} else if (a > 60) {
			System.out.println("meets expectations");
		} else {
			System.out.println("below par");
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int x = scn.nextInt();
			solutions(x);
		}
	}
}