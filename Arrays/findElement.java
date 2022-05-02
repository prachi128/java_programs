import java.util.*;

class findElement {
	public int findEl(int[] arr, int d) {
		for (int i=0; i<arr.length; i++) {
			if (arr[i] == d) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = scn.nextInt();
		}
		int d = scn.nextInt();
		findElement newArray = new findElement();
		System.out.println(newArray.findEl(arr, d));
	}
}