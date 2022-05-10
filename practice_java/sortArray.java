import java.util.*;

class sortArray {
	public static void sortAsc(int [] arr) {
		for (int pos=0; pos<arr.length-1; pos++){
			int current = arr[pos];
			int min_position = pos;
			for (int j=pos; j<arr.length-1; j++) {
				if (arr[j] < arr[min_position]) {
					min_position = j;
				}
			}
			int temp = arr[pos];
			arr[pos] = arr[min_position];
			arr[min_position] = temp;

		}
	}
	public static void main(String[] args) {
		int []arr = {5,8,2,6,9};
		sortAsc(arr);
		for (int x=0; x<arr.length; x++) {
			System.out.print(arr[x] + ", ");
		}
	}
}