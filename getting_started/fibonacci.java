import java.util.*;

class fibonacci {
	public static void fib(int n) {
		// int a = 0;
		// int b = 1;
		// int val = 0;
		// for (int i=0;i<n;i++) {
		// 	val = a + b;
		// 	System.out.println(a);
		// 	a = b;
		// 	b = val;
		// }
		int a = 0;
		int b = 1;
		int temp = 0;
		String answer = "";
		while (n > 0) {
			temp = a;
			a = b;
			b = temp + a;
			n--;
			answer += String.valueOf(a) + " ";
		}
		System.out.println(answer);

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		int n = scn.nextInt();
		fib(n);
	}
}
