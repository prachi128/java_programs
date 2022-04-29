import java.util.*;

class digits {
	public static int count(int n) {
		int cnt = 0;
		while (n > 0) {
			cnt++;
			n = n/10;
		}
		return cnt;
	}
	public static void print(int cnt, int n) {
		while(cnt > 0) {
			System.out.println(n/(int)Math.pow(10, cnt-1));
			n = n%(int)Math.pow(10, cnt-1);
			cnt--;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();
		print(count(x), x);
	}
}