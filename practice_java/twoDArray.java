import java.util.*;

class twoDArray {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[][] arr = new int[n][n];
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				if (i == j) {
					arr[i][j] = 0;
				}
				else if (i > j) {
					arr[i][j] = -1;
				}
				else {
					arr[i][j] = 1;
				}
			}
		}
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}