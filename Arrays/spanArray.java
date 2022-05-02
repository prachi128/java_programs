import java.util.*;

class spanArray {
	public static void span(int[] arr) { // 1 2 3 4 5
		int max = arr[0];
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(max - min);

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		// int maxelement = Integer.MAX_VALUE;
		// int minelement = Integer.MIN_VALUE;
		// System.out.println(maxelement);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		span(arr);

	}
}