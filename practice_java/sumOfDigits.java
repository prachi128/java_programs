import java.util.*;

class sumOfDigits {
	public static int sumOfDig(int n) {
		int sum = 0;
		while (n>0) {
			sum = sum + n%10;
			n /= 10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		System.out.println(sumOfDig(n));
	}
}