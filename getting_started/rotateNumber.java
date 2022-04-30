import java.util.*;

class rotateNumber {
	public static void rotate(int n, int k) {
		int num = n;
		int cnt = 0;
		int result = 0;
		while (n > 0) {
			cnt++;
			n = n/10;
		}
		int p = Math.abs(k);
			if (k>0) {
				while (k > 0) {
					int val = num%10;
					num = num/10;
					num = num + val * (int)Math.pow(10, cnt-1);
					k--;
				}
			}
			else {
				while (p > 0) {
					int val = num/(int)Math.pow(10, cnt-1);
					num = num%(int)Math.pow(10, cnt-1);
					num = num *10 + val;
					p--;
				}
			}
		System.out.println(num);
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int k = scn.nextInt();
		rotate(n, k);
	}
}
