import java.util.*;

class isPrimeNumber {
	public static boolean isPrime(int a) {
		//O(a)
		for (int i=2; i < a; i++) {
			if (a%i == 0) {
				return false;
			}
		}
		return true;
	}

	public static boolean isPrimeSquareRoot(int b) {
		for (int i=2; i*i <= b; i++) {
			if (b%i == 0) {
				return false;
			}
		}
		return true;
	}


	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t-- > 0) {
			int x = scn.nextInt();
			// if (isPrime(x)) {
			// 	System.out.println("prime");
			// }
			// else {
			// 	System.out.println("not prime");
			// }
			if (isPrimeSquareRoot(x)) {
				System.out.println("prime");
			}
			else {
				System.out.println("not prime");
			}
		}
	}
}