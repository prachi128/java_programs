import java.util.*;

class inputArrays {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		for (int j : arr) {
			System.out.println(j);
		}
		for (int k=0; k<n; k++) {
			System.out.println(arr[k]);
		}

	}
}