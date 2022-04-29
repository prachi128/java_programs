import java.util.*;

class printAllPrimes {
	public static boolean isPrime(int p) {
		for(int i=2; i*i <= p; i++) {
			if (p%i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int low = scn.nextInt();
		int high = scn.nextInt();
		while (low <= high) {
			if (isPrime(low)) {
				System.out.println(low);
			}
			low++;
		}
	}
}