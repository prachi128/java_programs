import java.util.*;

class pythagoreanTriplet {
	public static boolean pythagoras (int a, int b, int c) {
		if (a*a == b*b + c*c) {
			return true;
		}
		else if (b*b == a*a + c*c) {
			return true;
		}
		else if (c*c == a*a + b*b) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main (String[] args) {
		Scanner scn  = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();
		System.out.println(pythagoras(a, b, c));
	}
}