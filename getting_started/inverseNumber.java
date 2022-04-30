import java.util.*;

class inverseNumber {
	public static void inverse (int x) {
		int num = x;

		int result = 0;
		int cnt = 0;
		while (x > 0) {
			x = x/10;
			cnt++;
		}
		for ( int i=1; i<=cnt; i++) {
			int val = num%10; //5
			result = result + i * (int)Math.pow(10, val-1);
			num = num/10;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		inverse(n);
	}
}

// 23145
// 54321

// 54321
// 12453