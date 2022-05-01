import java.util.*;

class primeFactor {
	public static void prime(int n) {
		int num = n;
		int x = 2;
		while (x <= n) {
			for (int i = 2; i * i <= x; i++) {
				if (x % i == 0) {
					continue;
				}
			}
			// else returns prime number -> x
			if (n % x == 0) {
				n = n / x;
				if (x == num) {
					System.out.println(1);
				}
				System.out.println(x);
			} else {
				x++;
			}
		}
	}
	public static void main(String[] args) {
		Scanner scn  = new Scanner(System.in);
		int n = scn.nextInt();
		prime(n);
	}
}

// find prime numbers upto n
// starting from 2 divide and check
// and reduce the number until 1

// 12 -> 2 3 5 7 11