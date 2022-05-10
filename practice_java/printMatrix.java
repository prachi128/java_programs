import java.util.*;

class printMatrix {
	public static void printMat(int n) {
		for(int i=0; i<n; i++) { //rows
			for (int j=0; j<n; j++) { // columns
				// System.out.print("* ");
				if (i == j) {
					System.out.print(" 0");
				}
				if (j > i) {
					System.out.print(" 1");
				}
				if (j < i) {
					System.out.print("-1");
				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		printMat(n);
	}
}