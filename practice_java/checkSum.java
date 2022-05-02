import java.util.*;

class checkSum {
	public static int checkS(int one, int two) {
		int check;
		int sum = one + two;
		if (sum < 100) {
			check = 0;
		}
		else if (sum > 100) {
			check = 1;
		}
		else {
			check = 2;
		}
		return check;

	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int one = scn.nextInt();
		int two = scn.nextInt();
		System.out.println(checkS(one, two));
	}
}