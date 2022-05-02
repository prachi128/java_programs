import java.util.*;

class benjaminBulbs {
	public static void bulbs (int n) {
		for (int i=1; i*i<=n; i++) {
			System.out.println(i*i);
		}
	}
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		// String input = scn.nextLine();
		// int n = Integer.parseInt(scn.nextLine());
		// System.out.println(input);
		System.out.println(n);
		bulbs(n);
	}
}

// 1 - on
// 0 - 0ff
// b1 b2 b3 b4 b5 b6 b7 b8 b9 b10
// 1  1  1  1  1  1  1  1  1  1
// 1  0  1  0  1  0  1  0  1  0
// 1  0  0  0  1  1  1  0  0  0
// 1  0  0  1  1  1  1  1  0  0
// 1  0  0  1  0  1  1  1  0  1
// 1  0  0  1  0  0  1  1  0  1
// 1  0  0  1  0  0  0  1  0  1
// 1  0  0  1  0  0  0  0  0  1
// 1  0  0  1  0  0  0  0  1  1
// 1  0  0  1  0  0  0  0  1  0