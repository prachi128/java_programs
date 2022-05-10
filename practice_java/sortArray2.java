import java.util.*;

class sortArray2 {
	public static void sortArr(int[] arr) {
		int temp = 0;
		//for loop to hold the current element to be compared to the array
		for (int i=0; i<arr.length-1; i++) {
			//to get them compared with the current element
			for (int j=i+1; j<arr.length; j++) {
				//if any of higher index element is smaller than the current element
				if (arr[i] > arr[j]) {
					temp = arr[i]; //store the current element to temp
					arr[i] = arr[j]; 
					arr[j] = temp; 
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = {56,9,45,108,567,21};
		sortArr(arr);
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}