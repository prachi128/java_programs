import java.util.*;

class maxElement {
	public static int findMaxVal (int[] arr) {
		int max = arr[0];
		for (int i=1; i<arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		// int[] arr = {4,10,12,17,11};
		for (int i=0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(findMaxVal(arr));
	}
}