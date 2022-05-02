import java.util.*;

class upperLowerString {
	public static String test(String str) {
		if (str.length() % 2 == 0) {
			return str.toUpperCase();
		}
		return str.toLowerCase();
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		while (true) {
			String str = scn.nextLine();
			System.out.println(test(str));
		}
	}
}