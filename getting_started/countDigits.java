import java.util.*;

class countDigits {
	public static int count (int n) {
		int cnt = 0;
		while (n > 0) {
			n = n/10;
			cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(count(n));
	}
}