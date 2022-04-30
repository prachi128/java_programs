import java.util.*;

class gcdLcm {
	public static int gcd(int a, int b) {
		int x = Math.min(a, b);
		int y = Math.max(a, b);
		while (x > 1) {
			if (a%x == 0 && b%x == 0) {
				return x;
			} 
			x--;
		}
		return 1;
	}
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int g = gcd(a, b);
		System.out.println(g);
		int l = (a * b)/g;
		System.out.println(l);
	}
}