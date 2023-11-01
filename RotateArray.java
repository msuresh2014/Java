package practice;

public class RotateArray {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 1, 2, 3 };
		int target = -31;
		RotateArray r = new RotateArray();
		int piviot = r.findPiviotNumber(arr);
		System.out.println(" piviot = " + piviot);
		if (target < arr[piviot - 1] && target < arr[0])
			System.out.println(r.binarySearch(arr, target, piviot, arr.length - 1));
		else
			System.out.println(r.binarySearch(arr, target, 0, piviot - 1));
	}

	public int binarySearch(int[] arr, int numberToFind, int start, int end) {
		if (arr[start] == numberToFind)
			return start;

		// int start = 0, end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;

			// Return if we find the number.
			if (arr[mid] == numberToFind)
				return mid;

			// Move the pointers
			if (arr[mid] < numberToFind) {
				start = mid + 1;
			} else if (arr[mid] > numberToFind) {
				end = mid - 1;
			}
		}
		return -1;
	}

	public int findPiviotNumber(int[] arr) {
		int piviot = 0, index = 0, len = arr.length;
		if (len < 1)
			return index;
		while (index < len) {
			if (index + 1 < len && arr[index] <= arr[index + 1]) {
				index++;
				continue;
			} else if (index + 1 < len && arr[index] > arr[index + 1]) {
				index++;
				piviot = index;
				break;
			}
		}
		return piviot;
	}
}
