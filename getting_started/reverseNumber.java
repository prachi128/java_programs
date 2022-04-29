import java.util.*;

class reverseNumber {
	public static void reverse(int x) {
		while (x > 0) {
			System.out.println(x%10);
			x = x/10;
		}
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		reverse(x);
	}
}