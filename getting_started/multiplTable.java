import java.util.*;

class multiplTable {
	public static void main (String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			int x = scn.nextInt();
			String answer = "";
			for (int i=1; i<=10; i++) {
				answer += String.valueOf(x*i) + " ";
			}
			System.out.println(answer);
		}

	}
}