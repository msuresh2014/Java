package practice;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String argsp[]) {
		int[] arr = { 1, 4, 5, 7, 9, 12, 25, 37 };
		System.out.println(" Array " + Arrays.toString(arr));
		// Call binarySearch method.
		System.out.println("Index of the target element " + 1 + " is " + binarySearch(arr, 1));
		System.out.println("Index of the target element " + 5 + " is " + binarySearch(arr, 5));
		System.out.println("Index of the target element " + 25 + " is " + binarySearch(arr, 25));
		System.out.println("Index of the target element " + 8 + " is " + binarySearch(arr, 8));
		System.out.println("Index of the target element " + 12 + " is " + binarySearch(arr, 12));
		System.out.println("Index of the target element " + 37 + " is " + binarySearch(arr, 37));
	}

	public static int binarySearch(int[] arr, int numberToFind) {
		int length = arr.length - 1;
		int left = 0, right = length;
		int mid = length / 2;
		if (length == 0)
			return -1;

		while (left <= right) {
			if (arr[mid] == numberToFind)
				return mid;

			if (numberToFind > arr[mid]) {
				left = mid + 1;
			}

			if (numberToFind < arr[mid]) {
				right = mid - 1;
			}

			mid = (right + left) / 2;
		}
		return -1;

	}
}
